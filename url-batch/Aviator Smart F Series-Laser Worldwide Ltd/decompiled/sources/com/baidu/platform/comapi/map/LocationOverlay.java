package com.baidu.platform.comapi.map;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.baidu.platform.comjni.map.basemap.AppBaseMap;
import com.baidu.platform.comjni.tools.ParcelItem;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class LocationOverlay extends InnerOverlay {

    /* renamed from: d, reason: collision with root package name */
    private AppBaseMap f9446d;

    public LocationOverlay() {
        super(7);
    }

    public void beginLocationLayerAnimation() {
        this.f9446d.BeginLocationLayerAnimation();
    }

    public void clearLocationLayerData(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putLong("locationaddr", this.mLayerID);
        this.f9446d.ClearLocationLayerData(bundle);
    }

    @Override // com.baidu.platform.comapi.map.InnerOverlay
    public boolean getDefaultShowStatus() {
        return true;
    }

    @Override // com.baidu.platform.comapi.map.InnerOverlay
    public String getLayerTag() {
        return "location";
    }

    public void setLocationLayerData(List<OverlayLocationData> list) {
        Bundle bundle;
        Bundle bundle2;
        List<OverlayLocationData> list2 = list;
        if (list2 == null || list.size() <= 0 || this.mLayerID == 0) {
            return;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putLong("locationaddr", this.mLayerID);
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < list.size()) {
            OverlayLocationData overlayLocationData = list2.get(i8);
            if (overlayLocationData.getImgType() != "arrowicon") {
                if (overlayLocationData.getImgType() != "icon") {
                    bundle2 = bundle3;
                    if (overlayLocationData.getImgType() != "gificon") {
                        if (overlayLocationData.getImage() == null) {
                            return;
                        }
                        ParcelItem parcelItem = new ParcelItem();
                        Bitmap image = overlayLocationData.getImage();
                        Bundle bundle4 = new Bundle();
                        ByteBuffer allocate = ByteBuffer.allocate(image.getWidth() * image.getHeight() * 4);
                        image.copyPixelsToBuffer(allocate);
                        byte[] array = allocate.array();
                        bundle4.putByteArray("imgbin", array);
                        bundle4.putInt("w", overlayLocationData.getImgWidth());
                        bundle4.putInt(CmcdHeadersFactory.STREAMING_FORMAT_HLS, overlayLocationData.getImgHeight());
                        bundle4.putInt("rotation", overlayLocationData.isRotation());
                        bundle4.putString("name", overlayLocationData.getImgName() + "_" + Arrays.hashCode(array));
                        parcelItem.setBundle(bundle4);
                        arrayList.add(parcelItem);
                    } else if (overlayLocationData.getGIFImgPath() != null) {
                        ParcelItem parcelItem2 = new ParcelItem();
                        Bundle bundle5 = new Bundle();
                        bundle5.putInt("rotation", overlayLocationData.isRotation());
                        bundle5.putInt("animation", overlayLocationData.isAnimation());
                        bundle5.putString("gifpath", overlayLocationData.getGIFImgPath());
                        bundle5.putString("imgtype", overlayLocationData.getImgType());
                        bundle5.putString("name", overlayLocationData.getImgName());
                        bundle5.putFloat("markersize", overlayLocationData.getMarkerSize());
                        parcelItem2.setBundle(bundle5);
                        arrayList.add(parcelItem2);
                    }
                } else if (overlayLocationData.getImage() != null) {
                    ParcelItem parcelItem3 = new ParcelItem();
                    Bitmap image2 = overlayLocationData.getImage();
                    Bundle bundle6 = new Bundle();
                    bundle2 = bundle3;
                    ByteBuffer allocate2 = ByteBuffer.allocate(image2.getWidth() * image2.getHeight() * 4);
                    image2.copyPixelsToBuffer(allocate2);
                    bundle6.putByteArray("imgbin", allocate2.array());
                    bundle6.putInt("w", overlayLocationData.getImgWidth());
                    bundle6.putInt(CmcdHeadersFactory.STREAMING_FORMAT_HLS, overlayLocationData.getImgHeight());
                    bundle6.putInt("len", image2.getWidth() * image2.getHeight() * 4);
                    bundle6.putInt("rotation", overlayLocationData.isRotation());
                    bundle6.putInt("animation", overlayLocationData.isAnimation());
                    bundle6.putString("imgtype", overlayLocationData.getImgType());
                    bundle6.putString("name", overlayLocationData.getImgName());
                    bundle6.putFloat("markersize", overlayLocationData.getMarkerSize());
                    parcelItem3.setBundle(bundle6);
                    arrayList.add(parcelItem3);
                }
                i8++;
                list2 = list;
                bundle3 = bundle2;
            } else if (overlayLocationData.getImage() != null) {
                ParcelItem parcelItem4 = new ParcelItem();
                Bitmap image3 = overlayLocationData.getImage();
                Bundle bundle7 = new Bundle();
                ByteBuffer allocate3 = ByteBuffer.allocate(image3.getWidth() * image3.getHeight() * 4);
                image3.copyPixelsToBuffer(allocate3);
                bundle7.putByteArray("imgbin", allocate3.array());
                bundle7.putInt("w", overlayLocationData.getImgWidth());
                bundle7.putInt(CmcdHeadersFactory.STREAMING_FORMAT_HLS, overlayLocationData.getImgHeight());
                bundle7.putInt("len", image3.getWidth() * image3.getHeight() * 4);
                bundle7.putInt("rotation", 1);
                bundle7.putString("imgtype", overlayLocationData.getImgType());
                bundle7.putString("name", overlayLocationData.getImgName());
                bundle7.putFloat("arrowsize", overlayLocationData.getArrowSize());
                parcelItem4.setBundle(bundle7);
                arrayList.add(parcelItem4);
            }
            bundle2 = bundle3;
            i8++;
            list2 = list;
            bundle3 = bundle2;
        }
        Bundle bundle8 = bundle3;
        if (arrayList.size() > 0) {
            ParcelItem[] parcelItemArr = new ParcelItem[arrayList.size()];
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                parcelItemArr[i9] = (ParcelItem) arrayList.get(i9);
            }
            bundle = bundle8;
            bundle.putParcelableArray("imagedata", parcelItemArr);
        } else {
            bundle = bundle8;
        }
        this.f9446d.SetLocationLayerData(bundle);
    }

    public LocationOverlay(AppBaseMap appBaseMap) {
        super(7, appBaseMap);
        this.f9446d = appBaseMap;
    }
}
