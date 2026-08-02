package io.flutter.plugin.platform;

import E1.AbstractActivityC0029e;
import E1.AbstractC0033i;
import E1.I;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements O1.i, i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9272a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9273b;

    public /* synthetic */ o(int i3, Object obj) {
        this.f9272a = i3;
        this.f9273b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [io.flutter.plugin.platform.n, java.lang.Runnable] */
    @Override // O1.i
    public void a(O1.h hVar, final O1.g gVar) {
        i iVar;
        r rVar = (r) this.f9273b;
        int n3 = rVar.n(hVar.f1175b);
        int n4 = rVar.n(hVar.f1176c);
        int i3 = hVar.f1174a;
        if (!rVar.f(i3)) {
            g gVar2 = (g) rVar.f9305l.get(i3);
            j jVar = (j) rVar.o.get(i3);
            if (gVar2 == null || jVar == null) {
                Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i3);
                return;
            }
            if ((n3 > jVar.getRenderTargetWidth() || n4 > jVar.getRenderTargetHeight()) && (iVar = jVar.f) != null) {
                iVar.c(n3, n4);
            }
            ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
            layoutParams.width = n3;
            layoutParams.height = n4;
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 51;
            }
            jVar.setLayoutParams(layoutParams);
            View view = gVar2.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = n3;
                layoutParams2.height = n4;
                view.setLayoutParams(layoutParams2);
            }
            int round = (int) Math.round(jVar.getRenderTargetWidth() / rVar.g());
            int round2 = (int) Math.round(jVar.getRenderTargetHeight() / rVar.g());
            O1.j jVar2 = gVar.f1173a;
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(round));
            hashMap.put("height", Double.valueOf(round2));
            jVar2.success(hashMap);
            return;
        }
        final float g3 = rVar.g();
        final D d3 = (D) rVar.f9303j.get(Integer.valueOf(i3));
        io.flutter.plugin.editing.k kVar = rVar.f9300g;
        if (kVar != null) {
            if (kVar.f9217e.f291b == 3) {
                kVar.f9226p = true;
            }
            SingleViewPresentation singleViewPresentation = d3.f9235a;
            if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                d3.f9235a.getView().onInputConnectionLocked();
            }
        }
        ?? r3 = new Runnable() { // from class: io.flutter.plugin.platform.n
            @Override // java.lang.Runnable
            public final void run() {
                r rVar2 = (r) o.this.f9273b;
                io.flutter.plugin.editing.k kVar2 = rVar2.f9300g;
                D d4 = d3;
                if (kVar2 != null) {
                    if (kVar2.f9217e.f291b == 3) {
                        kVar2.f9226p = false;
                    }
                    SingleViewPresentation singleViewPresentation2 = d4.f9235a;
                    if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                        d4.f9235a.getView().onInputConnectionUnlocked();
                    }
                }
                double g4 = rVar2.f9297c == null ? g3 : rVar2.g();
                int round3 = (int) Math.round(d4.f.getWidth() / g4);
                int round4 = (int) Math.round(d4.f.getHeight() / g4);
                O1.j jVar3 = gVar.f1173a;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("width", Double.valueOf(round3));
                hashMap2.put("height", Double.valueOf(round4));
                jVar3.success(hashMap2);
            }
        };
        int width = d3.f.getWidth();
        i iVar2 = d3.f;
        if (n3 == width && n4 == iVar2.getHeight()) {
            d3.a().postDelayed(r3, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            View a3 = d3.a();
            iVar2.c(n3, n4);
            d3.f9241h.resize(n3, n4, d3.f9238d);
            d3.f9241h.setSurface(iVar2.getSurface());
            a3.postDelayed(r3, 0L);
            return;
        }
        boolean isFocused = d3.a().isFocused();
        w detachState = d3.f9235a.detachState();
        d3.f9241h.setSurface(null);
        d3.f9241h.release();
        DisplayManager displayManager = (DisplayManager) d3.f9236b.getSystemService("display");
        iVar2.c(n3, n4);
        d3.f9241h = displayManager.createVirtualDisplay("flutter-vd#" + d3.f9239e, n3, n4, d3.f9238d, iVar2.getSurface(), 0, D.f9234i, null);
        View a4 = d3.a();
        a4.addOnAttachStateChangeListener(new B(a4, (n) r3));
        SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(d3.f9236b, d3.f9241h.getDisplay(), d3.f9237c, detachState, d3.f9240g, isFocused);
        singleViewPresentation2.show();
        d3.f9235a.cancel();
        d3.f9235a = singleViewPresentation2;
    }

    @Override // O1.i
    public void b(boolean z) {
        ((r) this.f9273b).f9310r = z;
    }

    @Override // io.flutter.plugin.platform.i
    public void c(int i3, int i4) {
        ((TextureRegistry$SurfaceProducer) this.f9273b).setSize(i3, i4);
    }

    @Override // O1.i
    public void d(int i3, double d3, double d4) {
        r rVar = (r) this.f9273b;
        if (rVar.f(i3)) {
            return;
        }
        j jVar = (j) rVar.o.get(i3);
        if (jVar == null) {
            Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i3);
            return;
        }
        int n3 = rVar.n(d3);
        int n4 = rVar.n(d4);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
        layoutParams.topMargin = n3;
        layoutParams.leftMargin = n4;
        layoutParams.gravity = 51;
        jVar.setLayoutParams(layoutParams);
    }

    @Override // O1.i
    public void e(int i3, int i4) {
        View view;
        switch (this.f9272a) {
            case 0:
                if (i4 != 0 && i4 != 1) {
                    throw new IllegalStateException("Trying to set unknown direction value: " + i4 + "(view id: " + i3 + ")");
                }
                r rVar = (r) this.f9273b;
                if (rVar.f(i3)) {
                    view = ((D) rVar.f9303j.get(Integer.valueOf(i3))).a();
                } else {
                    g gVar = (g) rVar.f9305l.get(i3);
                    if (gVar == null) {
                        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i3);
                        return;
                    }
                    view = gVar.getView();
                }
                if (view != null) {
                    view.setLayoutDirection(i4);
                    return;
                }
                Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i3);
                return;
            default:
                g gVar2 = (g) ((q) this.f9273b).f9286i.get(i3);
                if (gVar2 == null) {
                    Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + i3);
                    return;
                }
                View view2 = gVar2.getView();
                if (view2 != null) {
                    view2.setLayoutDirection(i4);
                    return;
                }
                Log.e("PlatformViewsController2", "Setting direction to a null view with id: " + i3);
                return;
        }
    }

    public void f(O1.e eVar) {
        q qVar = (q) this.f9273b;
        HashMap hashMap = (HashMap) qVar.f9279a.f9273b;
        String str = eVar.f1152b;
        h hVar = (h) hashMap.get(str);
        if (hVar == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = eVar.f1158i;
        Object decodeMessage = byteBuffer != null ? hVar.getCreateArgsCodec().decodeMessage(byteBuffer) : null;
        Activity activity = qVar.f9281c;
        int i3 = eVar.f1151a;
        g create = hVar.create(activity, i3, decodeMessage);
        View view = create.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(eVar.f1156g);
        qVar.f9286i.put(i3, create);
        E1.t tVar = qVar.f9282d;
        if (tVar == null) {
            return;
        }
        create.onFlutterViewAttached(tVar);
    }

    @Override // O1.i
    public void g(O1.e eVar) {
        r rVar = (r) this.f9273b;
        r.a(rVar, eVar);
        if (rVar.f9299e.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        rVar.b(eVar, false);
        if (rVar.f9299e.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
    }

    @Override // io.flutter.plugin.platform.i
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer) this.f9273b).getHeight();
    }

    @Override // io.flutter.plugin.platform.i
    public long getId() {
        return ((TextureRegistry$SurfaceProducer) this.f9273b).id();
    }

    @Override // io.flutter.plugin.platform.i
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer) this.f9273b).getSurface();
    }

    @Override // io.flutter.plugin.platform.i
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer) this.f9273b).getWidth();
    }

    @Override // O1.i
    public void h(O1.e eVar) {
        throw new IllegalStateException("Trying to create an HC++ platform view from within PlatformViewsController1. Request: " + eVar);
    }

    public CharSequence i(O1.b bVar) {
        AbstractActivityC0029e abstractActivityC0029e = ((f) this.f9273b).f9251a;
        ClipboardManager clipboardManager = (ClipboardManager) abstractActivityC0029e.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (clipboardManager.hasPrimaryClip()) {
            try {
                try {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null) {
                        if (bVar != null) {
                            if (bVar == O1.b.f1139a) {
                            }
                        }
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        CharSequence text = itemAt.getText();
                        if (text != null) {
                            return text;
                        }
                        try {
                            Uri uri = itemAt.getUri();
                            if (uri == null) {
                                Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                                return null;
                            }
                            String scheme = uri.getScheme();
                            if (!scheme.equals("content")) {
                                Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                                return null;
                            }
                            AssetFileDescriptor openTypedAssetFileDescriptor = abstractActivityC0029e.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(abstractActivityC0029e);
                            if (openTypedAssetFileDescriptor == null) {
                                return coerceToText;
                            }
                            try {
                                openTypedAssetFileDescriptor.close();
                                return coerceToText;
                            } catch (IOException e3) {
                                charSequence = coerceToText;
                                e = e3;
                                Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                return charSequence;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            charSequence = text;
                        }
                    }
                } catch (IOException e5) {
                    e = e5;
                }
            } catch (FileNotFoundException unused) {
                Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                return charSequence;
            } catch (SecurityException e6) {
                Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e6);
                return charSequence;
            }
        }
        return null;
    }

    public void j(String str, h hVar) {
        HashMap hashMap = (HashMap) this.f9273b;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(str, hVar);
    }

    @Override // O1.i
    public void k(O1.f fVar) {
        switch (this.f9272a) {
            case 0:
                r rVar = (r) this.f9273b;
                float f = rVar.f9297c.getResources().getDisplayMetrics().density;
                int i3 = fVar.f1159a;
                if (!rVar.f(i3)) {
                    g gVar = (g) rVar.f9305l.get(i3);
                    if (gVar == null) {
                        Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i3);
                        break;
                    } else {
                        View view = gVar.getView();
                        if (view == null) {
                            Log.e("PlatformViewsController", "Sending touch to a null view with id: " + i3);
                            break;
                        } else {
                            view.dispatchTouchEvent(rVar.l(f, fVar, false));
                            break;
                        }
                    }
                } else {
                    D d3 = (D) rVar.f9303j.get(Integer.valueOf(i3));
                    MotionEvent l3 = rVar.l(f, fVar, true);
                    SingleViewPresentation singleViewPresentation = d3.f9235a;
                    if (singleViewPresentation != null) {
                        singleViewPresentation.dispatchTouchEvent(l3);
                        break;
                    }
                }
                break;
            default:
                q qVar = (q) this.f9273b;
                float f3 = qVar.f9281c.getResources().getDisplayMetrics().density;
                SparseArray sparseArray = qVar.f9286i;
                int i4 = fVar.f1159a;
                g gVar2 = (g) sparseArray.get(i4);
                if (gVar2 == null) {
                    Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + i4);
                    break;
                } else {
                    View view2 = gVar2.getView();
                    if (view2 == null) {
                        Log.e("PlatformViewsController2", "Sending touch to a null view with id: " + i4);
                        break;
                    } else {
                        MotionEvent D3 = qVar.f9288k.D(new I(fVar.f1172p));
                        List<List> list = (List) fVar.f1164g;
                        ArrayList arrayList = new ArrayList();
                        for (List list2 : list) {
                            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
                            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
                            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
                            double d4 = f3;
                            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d4);
                            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d4);
                            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d4);
                            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d4);
                            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d4);
                            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d4);
                            arrayList.add(pointerCoords);
                        }
                        int i5 = fVar.f1163e;
                        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i5]);
                        if (D3 == null) {
                            List<List> list3 = (List) fVar.f;
                            ArrayList arrayList2 = new ArrayList();
                            for (List list4 : list3) {
                                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                                pointerProperties.id = ((Integer) list4.get(0)).intValue();
                                pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
                                arrayList2.add(pointerProperties);
                            }
                            D3 = MotionEvent.obtain(fVar.f1160b.longValue(), fVar.f1161c.longValue(), fVar.f1162d, fVar.f1163e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i5]), pointerCoordsArr, fVar.f1165h, fVar.f1166i, fVar.f1167j, fVar.f1168k, fVar.f1169l, fVar.f1170m, fVar.f1171n, fVar.o);
                        } else if (pointerCoordsArr.length >= 1) {
                            D3.offsetLocation(pointerCoordsArr[0].x - D3.getX(), pointerCoordsArr[0].y - D3.getY());
                        }
                        view2.dispatchTouchEvent(D3);
                        break;
                    }
                }
        }
    }

    @Override // O1.i
    public void l(int i3) {
        View view;
        switch (this.f9272a) {
            case 0:
                r rVar = (r) this.f9273b;
                if (rVar.f(i3)) {
                    view = ((D) rVar.f9303j.get(Integer.valueOf(i3))).a();
                } else {
                    g gVar = (g) rVar.f9305l.get(i3);
                    if (gVar == null) {
                        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i3);
                        break;
                    } else {
                        view = gVar.getView();
                    }
                }
                if (view != null) {
                    view.clearFocus();
                    break;
                } else {
                    Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i3);
                    break;
                }
            default:
                g gVar2 = (g) ((q) this.f9273b).f9286i.get(i3);
                if (gVar2 != null) {
                    View view2 = gVar2.getView();
                    if (view2 != null) {
                        view2.clearFocus();
                        break;
                    } else {
                        Log.e("PlatformViewsController2", "Clearing focus on a null view with id: " + i3);
                        break;
                    }
                } else {
                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + i3);
                    break;
                }
        }
    }

    public void m(ArrayList arrayList) {
        f fVar = (f) this.f9273b;
        if (fVar.f) {
            fVar.f = false;
            C2.b.E(fVar.f9251a.getWindow(), true);
        }
        int i3 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            int ordinal = ((O1.d) arrayList.get(i4)).ordinal();
            if (ordinal == 0) {
                i3 &= -5;
            } else if (ordinal == 1) {
                i3 &= -515;
            }
        }
        fVar.f9255e = i3;
        fVar.b();
    }

    public void n(int i3) {
        int i4;
        f fVar = (f) this.f9273b;
        fVar.getClass();
        AbstractActivityC0029e abstractActivityC0029e = fVar.f9251a;
        if (i3 != 4 && fVar.f) {
            fVar.f = false;
            C2.b.E(abstractActivityC0029e.getWindow(), true);
        }
        if (i3 == 1) {
            i4 = 1798;
        } else if (i3 == 2) {
            i4 = 3846;
        } else {
            if (i3 != 3) {
                if (i3 != 4 || Build.VERSION.SDK_INT < 29) {
                    return;
                }
                fVar.f = true;
                C2.b.E(abstractActivityC0029e.getWindow(), false);
                O1.c cVar = fVar.f9254d;
                if (cVar != null) {
                    fVar.a(cVar);
                    return;
                }
                return;
            }
            i4 = 5894;
        }
        fVar.f9255e = i4;
        fVar.b();
    }

    @Override // O1.i
    public void o(int i3) {
        K1.a aVar;
        switch (this.f9272a) {
            case 0:
                r rVar = (r) this.f9273b;
                g gVar = (g) rVar.f9305l.get(i3);
                if (gVar != null) {
                    if (gVar.getView() != null) {
                        View view = gVar.getView();
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                    }
                    rVar.f9305l.remove(i3);
                    try {
                        gVar.dispose();
                    } catch (RuntimeException e3) {
                        Log.e("PlatformViewsController", "Disposing platform view threw an exception", e3);
                    }
                    if (!rVar.f(i3)) {
                        SparseArray sparseArray = rVar.o;
                        j jVar = (j) sparseArray.get(i3);
                        if (jVar == null) {
                            SparseArray sparseArray2 = rVar.f9306m;
                            K1.b bVar = (K1.b) sparseArray2.get(i3);
                            if (bVar != null) {
                                bVar.removeAllViews();
                                bVar.a();
                                ViewGroup viewGroup2 = (ViewGroup) bVar.getParent();
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(bVar);
                                }
                                sparseArray2.remove(i3);
                                break;
                            }
                        } else {
                            jVar.removeAllViews();
                            i iVar = jVar.f;
                            if (iVar != null) {
                                iVar.release();
                                jVar.f = null;
                            }
                            ViewTreeObserver viewTreeObserver = jVar.getViewTreeObserver();
                            if (viewTreeObserver.isAlive() && (aVar = jVar.f9261g) != null) {
                                jVar.f9261g = null;
                                viewTreeObserver.removeOnGlobalFocusChangeListener(aVar);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) jVar.getParent();
                            if (viewGroup3 != null) {
                                viewGroup3.removeView(jVar);
                            }
                            sparseArray.remove(i3);
                            break;
                        }
                    } else {
                        HashMap hashMap = rVar.f9303j;
                        D d3 = (D) hashMap.get(Integer.valueOf(i3));
                        View a3 = d3.a();
                        if (a3 != null) {
                            rVar.f9304k.remove(a3.getContext());
                        }
                        d3.f9235a.cancel();
                        d3.f9235a.detachState();
                        d3.f9241h.release();
                        d3.f.release();
                        hashMap.remove(Integer.valueOf(i3));
                        break;
                    }
                } else {
                    Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i3);
                    break;
                }
                break;
            default:
                q qVar = (q) this.f9273b;
                qVar.f9292p.remove(Integer.valueOf(i3));
                SparseArray sparseArray3 = qVar.f9286i;
                g gVar2 = (g) sparseArray3.get(i3);
                if (gVar2 != null) {
                    if (gVar2.getView() != null) {
                        View view2 = gVar2.getView();
                        ViewGroup viewGroup4 = (ViewGroup) view2.getParent();
                        if (viewGroup4 != null) {
                            viewGroup4.removeView(view2);
                        }
                    }
                    sparseArray3.remove(i3);
                    try {
                        gVar2.dispose();
                    } catch (RuntimeException e4) {
                        Log.e("PlatformViewsController2", "Disposing platform view threw an exception", e4);
                    }
                    SparseArray sparseArray4 = qVar.f9287j;
                    K1.b bVar2 = (K1.b) sparseArray4.get(i3);
                    if (bVar2 != null) {
                        bVar2.removeAllViews();
                        bVar2.a();
                        ViewGroup viewGroup5 = (ViewGroup) bVar2.getParent();
                        if (viewGroup5 != null) {
                            viewGroup5.removeView(bVar2);
                        }
                        sparseArray4.remove(i3);
                        break;
                    }
                } else {
                    Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i3);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [io.flutter.plugin.platform.m] */
    @Override // O1.i
    public long p(final O1.e eVar) {
        j jVar;
        long j3;
        final int i3 = 0;
        final int i4 = 1;
        final r rVar = (r) this.f9273b;
        r.a(rVar, eVar);
        SparseArray sparseArray = rVar.o;
        int i5 = eVar.f1151a;
        if (sparseArray.get(i5) != null) {
            throw new IllegalStateException(AbstractC0033i.h(i5, "Trying to create an already created platform view, view id: "));
        }
        if (rVar.f == null) {
            throw new IllegalStateException(AbstractC0033i.h(i5, "Texture registry is null. This means that platform views controller was detached, view id: "));
        }
        if (rVar.f9298d == null) {
            throw new IllegalStateException(AbstractC0033i.h(i5, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
        }
        g b3 = rVar.b(eVar, true);
        View view = b3.getView();
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        boolean U2 = android.support.v4.media.session.a.U(view, new Y1.E(18, r.f9294x));
        double d3 = eVar.f1154d;
        double d4 = eVar.f1153c;
        if (U2) {
            if (eVar.f1157h == 2) {
                if (rVar.f9299e.IsSurfaceControlEnabled()) {
                    throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
                }
                return -2L;
            }
            if (!rVar.v) {
                i i6 = r.i(rVar.f);
                int n3 = rVar.n(d4);
                int n4 = rVar.n(d3);
                Activity activity = rVar.f9297c;
                ?? r7 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.m
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z) {
                        switch (i4) {
                            case 0:
                                O1.e eVar2 = eVar;
                                r rVar2 = rVar;
                                int i7 = eVar2.f1151a;
                                if (!z) {
                                    io.flutter.plugin.editing.k kVar = rVar2.f9300g;
                                    if (kVar != null) {
                                        kVar.b(i7);
                                        break;
                                    }
                                } else {
                                    P1.o oVar = (P1.o) rVar2.f9301h.f1599b;
                                    if (oVar != null) {
                                        oVar.a("viewFocused", Integer.valueOf(i7), null);
                                        break;
                                    }
                                }
                                break;
                            default:
                                r rVar3 = rVar;
                                if (!z) {
                                    rVar3.getClass();
                                    break;
                                } else {
                                    V0.e eVar3 = rVar3.f9301h;
                                    O1.e eVar4 = eVar;
                                    P1.o oVar2 = (P1.o) eVar3.f1599b;
                                    if (oVar2 != null) {
                                        oVar2.a("viewFocused", Integer.valueOf(eVar4.f1151a), null);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
                z zVar = D.f9234i;
                D d5 = null;
                if (n3 != 0 && n4 != 0) {
                    DisplayManager displayManager = (DisplayManager) activity.getSystemService("display");
                    DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                    i6.c(n3, n4);
                    StringBuilder sb = new StringBuilder("flutter-vd#");
                    int i7 = eVar.f1151a;
                    sb.append(i7);
                    VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay(sb.toString(), n3, n4, displayMetrics.densityDpi, i6.getSurface(), 0, D.f9234i, null);
                    if (createVirtualDisplay != null) {
                        d5 = new D(activity, rVar.f9302i, createVirtualDisplay, b3, i6, r7, i7);
                    }
                }
                if (d5 != null) {
                    rVar.f9303j.put(Integer.valueOf(i5), d5);
                    View view2 = b3.getView();
                    rVar.f9304k.put(view2.getContext(), view2);
                    return i6.getId();
                }
                throw new IllegalStateException("Failed creating virtual display for a " + eVar.f1152b + " with id: " + i5);
            }
        }
        int n5 = rVar.n(d4);
        int n6 = rVar.n(d3);
        if (rVar.v) {
            jVar = new j(rVar.f9297c);
            j3 = -1;
        } else {
            i i8 = r.i(rVar.f);
            j jVar2 = new j(rVar.f9297c);
            jVar2.f = i8;
            Surface surface = i8.getSurface();
            if (surface != null) {
                Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                } finally {
                    surface.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
            long id = i8.getId();
            jVar = jVar2;
            j3 = id;
        }
        jVar.setTouchProcessor(rVar.f9296b);
        i iVar = jVar.f;
        if (iVar != null) {
            iVar.c(n5, n6);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n5, n6, 51);
        int n7 = rVar.n(eVar.f1155e);
        int n8 = rVar.n(eVar.f);
        layoutParams.topMargin = n7;
        layoutParams.leftMargin = n8;
        jVar.setLayoutParams(layoutParams);
        View view3 = b3.getView();
        view3.setLayoutParams(new FrameLayout.LayoutParams(n5, n6));
        view3.setImportantForAccessibility(4);
        jVar.addView(view3);
        jVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view22, boolean z) {
                switch (i3) {
                    case 0:
                        O1.e eVar2 = eVar;
                        r rVar2 = rVar;
                        int i72 = eVar2.f1151a;
                        if (!z) {
                            io.flutter.plugin.editing.k kVar = rVar2.f9300g;
                            if (kVar != null) {
                                kVar.b(i72);
                                break;
                            }
                        } else {
                            P1.o oVar = (P1.o) rVar2.f9301h.f1599b;
                            if (oVar != null) {
                                oVar.a("viewFocused", Integer.valueOf(i72), null);
                                break;
                            }
                        }
                        break;
                    default:
                        r rVar3 = rVar;
                        if (!z) {
                            rVar3.getClass();
                            break;
                        } else {
                            V0.e eVar3 = rVar3.f9301h;
                            O1.e eVar4 = eVar;
                            P1.o oVar2 = (P1.o) eVar3.f1599b;
                            if (oVar2 != null) {
                                oVar2.a("viewFocused", Integer.valueOf(eVar4.f1151a), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        rVar.f9298d.addView(jVar);
        sparseArray.append(i5, jVar);
        E1.t tVar = rVar.f9298d;
        if (tVar == null) {
            return j3;
        }
        b3.onFlutterViewAttached(tVar);
        return j3;
    }

    @Override // O1.i
    public boolean q() {
        return false;
    }

    public void r(int i3) {
        View decorView = ((f) this.f9273b).f9251a.getWindow().getDecorView();
        switch (M.j.b(i3)) {
            case 0:
                decorView.performHapticFeedback(0);
                break;
            case 1:
                decorView.performHapticFeedback(1);
                break;
            case 2:
                decorView.performHapticFeedback(3);
                break;
            case 3:
                decorView.performHapticFeedback(6);
                break;
            case 4:
                decorView.performHapticFeedback(4);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                    break;
                }
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                    break;
                }
                break;
            case 7:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                    break;
                }
                break;
        }
    }

    @Override // io.flutter.plugin.platform.i
    public void release() {
        ((TextureRegistry$SurfaceProducer) this.f9273b).release();
        this.f9273b = null;
    }

    @Override // io.flutter.plugin.platform.i
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer) this.f9273b).scheduleFrame();
    }

    public o(int i3) {
        this.f9272a = i3;
        switch (i3) {
            case 4:
                break;
            default:
                this.f9273b = new HashMap();
                break;
        }
    }
}
