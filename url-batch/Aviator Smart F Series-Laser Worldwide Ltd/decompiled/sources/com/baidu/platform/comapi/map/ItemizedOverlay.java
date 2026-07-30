package com.baidu.platform.comapi.map;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.baidu.platform.comapi.map.OverlayItem;
import com.baidu.platform.comjni.tools.ParcelItem;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ItemizedOverlay<Item extends OverlayItem> extends Overlay implements Comparator<Integer> {

    /* renamed from: a, reason: collision with root package name */
    protected ArrayList<OverlayItem> f9436a;

    /* renamed from: b, reason: collision with root package name */
    protected ArrayList<Integer> f9437b;

    /* renamed from: c, reason: collision with root package name */
    protected Drawable f9438c;

    /* renamed from: d, reason: collision with root package name */
    protected MapSurfaceView f9439d;

    /* renamed from: e, reason: collision with root package name */
    protected MapTextureView f9440e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f9441f;

    /* renamed from: g, reason: collision with root package name */
    protected Drawable f9442g;

    /* renamed from: h, reason: collision with root package name */
    protected OverlayItem f9443h;

    /* renamed from: i, reason: collision with root package name */
    protected int f9444i = 0;

    /* renamed from: j, reason: collision with root package name */
    protected int f9445j;

    public ItemizedOverlay(Drawable drawable, MapSurfaceView mapSurfaceView) {
        this.mType = 27;
        this.f9438c = drawable;
        this.f9436a = new ArrayList<>();
        this.f9437b = new ArrayList<>();
        this.f9439d = mapSurfaceView;
        this.mLayerID = 0L;
    }

    private int a() {
        int i8 = this.f9445j;
        if (i8 >= Integer.MAX_VALUE) {
            return 0;
        }
        int i9 = i8 + 1;
        this.f9445j = i9;
        return i9;
    }

    public void addItem(OverlayItem overlayItem) {
        if (overlayItem != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(overlayItem);
            addItem(arrayList);
        }
    }

    public void addItemsByReplace(List<OverlayItem> list) {
        a(list, false, true);
    }

    boolean b() {
        return this.f9441f;
    }

    void c() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f9436a);
        }
        removeAll();
        addItem(arrayList);
    }

    public ArrayList<OverlayItem> getAllItem() {
        return this.f9436a;
    }

    public GeoPoint getCenter() {
        int a8 = a(0);
        if (a8 == -1) {
            return null;
        }
        return getItem(a8).getPoint();
    }

    public final OverlayItem getItem(int i8) {
        ArrayList arrayList;
        if (this.f9436a == null) {
            return null;
        }
        synchronized (this) {
            arrayList = new ArrayList(this.f9436a);
        }
        if (arrayList.size() <= i8 || i8 < 0) {
            return null;
        }
        return (OverlayItem) arrayList.get(i8);
    }

    public int getLatSpanE6() {
        return a(true);
    }

    public int getLonSpanE6() {
        return a(false);
    }

    public int getUpdateType() {
        return this.f9444i;
    }

    public void initLayer() {
        long AddLayer = this.f9439d.getController().getBaseMap().AddLayer(0, 0, "item");
        this.mLayerID = AddLayer;
        if (AddLayer == 0) {
            throw new RuntimeException("can not add new layer");
        }
    }

    public boolean onTap(int i8) {
        return false;
    }

    public boolean removeAll() {
        synchronized (this) {
            try {
                if (this.f9436a.isEmpty()) {
                    return false;
                }
                if (this.f9439d.getController() != null && this.f9439d.getController().getBaseMap() != null) {
                    this.f9439d.getController().getBaseMap().ClearLayer(this.mLayerID);
                }
                synchronized (this) {
                    this.f9436a.clear();
                    this.f9441f = true;
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean removeItem(OverlayItem overlayItem) {
        if (this.mLayerID == 0) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("itemaddr", this.mLayerID);
        if (overlayItem.getId().equals("")) {
            return false;
        }
        bundle.putString("id", overlayItem.getId());
        if (!this.f9439d.getController().getBaseMap().RemoveItemData(bundle)) {
            return false;
        }
        synchronized (this) {
            this.f9436a.remove(overlayItem);
            this.f9441f = true;
        }
        return true;
    }

    public boolean removeOneItem(Iterator<OverlayItem> it, OverlayItem overlayItem) {
        if (this.mLayerID == 0) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("itemaddr", this.mLayerID);
        if (overlayItem.getId().equals("")) {
            return false;
        }
        bundle.putString("id", overlayItem.getId());
        if (!this.f9439d.getController().getBaseMap().RemoveItemData(bundle)) {
            return false;
        }
        it.remove();
        synchronized (this) {
            this.f9441f = true;
        }
        return true;
    }

    public void setFocus(int i8, boolean z7) {
        OverlayItem item;
        ArrayList arrayList;
        if (this.f9443h == null || (item = getItem(i8)) == null) {
            return;
        }
        if (z7) {
            this.f9443h.setGeoPoint(new GeoPoint(item.getPoint().getLatitude(), item.getPoint().getLongitude()));
            synchronized (this) {
                arrayList = new ArrayList(this.f9436a);
            }
            if (arrayList.contains(this.f9443h)) {
                updateItem(this.f9443h);
            } else {
                addItem(this.f9443h);
            }
        } else {
            removeItem(this.f9443h);
        }
        MapSurfaceView mapSurfaceView = this.f9439d;
        if (mapSurfaceView != null) {
            mapSurfaceView.refresh(this);
        }
    }

    public void setFocusMarker(Drawable drawable) {
        this.f9442g = drawable;
        if (this.f9443h == null) {
            this.f9443h = new OverlayItem(null, "", "");
        }
        this.f9443h.setMarker(this.f9442g);
    }

    public void setUpdateType(int i8) {
        this.f9444i = i8;
    }

    public void setmMarker(Drawable drawable) {
        this.f9438c = drawable;
    }

    public synchronized int size() {
        ArrayList<OverlayItem> arrayList;
        arrayList = this.f9436a;
        return arrayList == null ? 0 : arrayList.size();
    }

    public boolean updateItem(OverlayItem overlayItem) {
        ArrayList arrayList;
        if (overlayItem == null || overlayItem.getId().equals("")) {
            return false;
        }
        synchronized (this) {
            arrayList = new ArrayList(this.f9436a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (overlayItem.getId().equals(((OverlayItem) it.next()).getId())) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(overlayItem);
                a(arrayList2, true);
                return true;
            }
        }
        return false;
    }

    private void a(List<OverlayItem> list, boolean z7) {
        a(list, z7, false);
    }

    synchronized void b(boolean z7) {
        this.f9441f = z7;
    }

    @Override // java.util.Comparator
    public int compare(Integer num, Integer num2) {
        GeoPoint point;
        GeoPoint point2;
        synchronized (this) {
            point = this.f9436a.get(num.intValue()).getPoint();
            point2 = this.f9436a.get(num2.intValue()).getPoint();
        }
        if (point.getLatitude() > point2.getLatitude()) {
            return -1;
        }
        if (point.getLatitude() < point2.getLatitude()) {
            return 1;
        }
        if (point.getLongitude() < point2.getLongitude()) {
            return -1;
        }
        return point.getLongitude() == point2.getLongitude() ? 0 : 1;
    }

    public boolean onTap(int i8, int i9, GeoPoint geoPoint) {
        return false;
    }

    private void a(List<OverlayItem> list, boolean z7, boolean z8) {
        GeoPoint point;
        if (z8) {
            synchronized (this) {
                try {
                    ArrayList<OverlayItem> arrayList = this.f9436a;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                } finally {
                }
            }
        }
        if (this.mLayerID == 0) {
            if (z7) {
                return;
            }
            synchronized (this) {
                try {
                    ArrayList<OverlayItem> arrayList2 = this.f9436a;
                    if (arrayList2 != null && list != null) {
                        arrayList2.addAll(list);
                    }
                } finally {
                }
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.clear();
        ArrayList arrayList3 = new ArrayList();
        bundle.putLong("itemaddr", this.mLayerID);
        bundle.putInt("bshow", 1);
        if (z7) {
            bundle.putString("extparam", "update");
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            OverlayItem overlayItem = list.get(i8);
            if (overlayItem.getMarker() == null) {
                overlayItem.setMarker(this.f9438c);
            }
            if (TextUtils.isEmpty(overlayItem.getId())) {
                overlayItem.setId(p.a());
            }
            ParcelItem parcelItem = new ParcelItem();
            Drawable marker = overlayItem.getMarker();
            byte[] gifData = overlayItem.getGifData();
            if (marker != null || gifData != null) {
                Bundle bundle2 = new Bundle();
                if (overlayItem.getCoordType() == OverlayItem.CoordType.CoordType_BD09LL) {
                    point = m.a(overlayItem.getPoint());
                } else {
                    point = overlayItem.getPoint();
                }
                bundle2.putDouble("x", point.getLongitude());
                bundle2.putDouble("y", point.getLatitude());
                bundle2.putFloat(MapBundleKey.MapObjKey.OBJ_GEO_Z, overlayItem.getGeoZ());
                bundle2.putInt(MapBundleKey.MapObjKey.OBJ_INDOOR_POI, overlayItem.getIndoorPoi());
                bundle2.putInt("showLR", 1);
                bundle2.putInt("iconwidth", 0);
                bundle2.putInt("iconlayer", 1);
                bundle2.putFloat("ax", overlayItem.getAnchorX());
                bundle2.putFloat("ay", overlayItem.getAnchorY());
                bundle2.putInt("bound", overlayItem.getBound());
                bundle2.putInt("level", overlayItem.getLevel());
                bundle2.putInt("mask", overlayItem.getMask());
                bundle2.putString("popname", "" + overlayItem.getId());
                if (gifData != null) {
                    bundle2.putFloat("gifscale", overlayItem.getScale());
                    bundle2.putInt("gifsize", gifData.length);
                    bundle2.putByteArray("imgdata", gifData);
                    bundle2.putInt("imgindex", a());
                } else {
                    Bitmap a8 = com.baidu.platform.comapi.util.c.a(marker);
                    if (a8 != null) {
                        bundle2.putInt("imgindex", overlayItem.getResId());
                        bundle2.putInt("imgW", a8.getWidth());
                        bundle2.putInt("imgH", a8.getHeight());
                        if (!z7 && a(overlayItem)) {
                            bundle2.putByteArray("imgdata", null);
                        } else {
                            ByteBuffer allocate = ByteBuffer.allocate(a8.getWidth() * a8.getHeight() * 4);
                            a8.copyPixelsToBuffer(allocate);
                            bundle2.putByteArray("imgdata", allocate.array());
                        }
                    }
                }
                String[] a9 = a(overlayItem.getClickRect());
                if (a9 != null && a9.length > 0) {
                    bundle2.putStringArray("clickrect", a9);
                }
                bundle2.putBundle("animate", overlayItem.getAnimate());
                bundle2.putBundle("delay", overlayItem.getDelay());
                parcelItem.setBundle(bundle2);
                arrayList3.add(parcelItem);
                if (!z7) {
                    this.f9436a.add(overlayItem);
                }
            }
        }
        if (arrayList3.size() > 0) {
            ParcelItem[] parcelItemArr = new ParcelItem[arrayList3.size()];
            for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                parcelItemArr[i9] = (ParcelItem) arrayList3.get(i9);
            }
            bundle.putParcelableArray("itemdatas", parcelItemArr);
            this.f9439d.getController().getBaseMap().AddItemData(bundle, z8);
        }
        synchronized (this) {
            this.f9441f = true;
        }
    }

    public boolean onTap(GeoPoint geoPoint, MapSurfaceView mapSurfaceView) {
        return false;
    }

    public void setFocusMarker(Drawable drawable, float f8, float f9) {
        this.f9442g = drawable;
        if (this.f9443h == null) {
            OverlayItem overlayItem = new OverlayItem(null, "", "");
            this.f9443h = overlayItem;
            overlayItem.setAnchor(f8, f9);
        }
        this.f9443h.setMarker(this.f9442g);
    }

    public ItemizedOverlay(Drawable drawable, MapTextureView mapTextureView) {
        this.mType = 27;
        this.f9438c = drawable;
        this.f9436a = new ArrayList<>();
        this.f9437b = new ArrayList<>();
        this.f9440e = mapTextureView;
        this.mLayerID = 0L;
    }

    public void addItem(List<OverlayItem> list) {
        a(list, false, false);
    }

    public boolean updateItem(List<OverlayItem> list) {
        if (list == null) {
            return false;
        }
        a(list, true);
        return true;
    }

    protected String[] a(ArrayList<Bundle> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i8 = 0; i8 < size; i8++) {
            JSONObject jSONObject = new JSONObject();
            Bundle bundle = arrayList.get(i8);
            for (String str : bundle.keySet()) {
                try {
                    jSONObject.put(str, bundle.get(str));
                } catch (JSONException unused) {
                }
            }
            strArr[i8] = jSONObject.toString();
        }
        return strArr;
    }

    private int a(boolean z7) {
        ArrayList arrayList;
        if (this.f9436a == null) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f9436a.size() == 0) {
                    return 0;
                }
                synchronized (this) {
                    arrayList = new ArrayList(this.f9436a);
                }
                Iterator it = arrayList.iterator();
                int i8 = Integer.MIN_VALUE;
                int i9 = Integer.MAX_VALUE;
                while (it.hasNext()) {
                    GeoPoint point = ((OverlayItem) it.next()).getPoint();
                    int latitude = (int) (z7 ? point.getLatitude() : point.getLongitude());
                    if (latitude > i8) {
                        i8 = latitude;
                    }
                    if (latitude < i9) {
                        i9 = latitude;
                    }
                }
                return i8 - i9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected int a(int i8) {
        synchronized (this) {
            try {
                ArrayList<OverlayItem> arrayList = this.f9436a;
                if (arrayList != null && arrayList.size() != 0) {
                    return i8;
                }
                return -1;
            } finally {
            }
        }
    }

    protected boolean a(OverlayItem overlayItem) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f9436a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OverlayItem overlayItem2 = (OverlayItem) it.next();
            if (overlayItem.getResId() == -1) {
                return false;
            }
            if (overlayItem2.getResId() != -1 && overlayItem.getResId() == overlayItem2.getResId()) {
                return true;
            }
        }
        return false;
    }
}
