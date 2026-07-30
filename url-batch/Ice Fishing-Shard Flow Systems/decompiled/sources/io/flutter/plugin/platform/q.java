package io.flutter.plugin.platform;

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
import h4.AbstractActivityC0488c;
import h4.C0483D;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n4.C0758a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class q implements r4.k, i, j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5723d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5724e;

    public /* synthetic */ q(int i2, Object obj) {
        this.f5723d = i2;
        this.f5724e = obj;
    }

    @Override // io.flutter.plugin.platform.j
    public void a(int i2, int i5) {
        ((TextureRegistry$SurfaceProducer) this.f5724e).setSize(i2, i5);
    }

    public void b(r4.h hVar) {
        t tVar = (t) this.f5724e;
        q qVar = tVar.f5730d;
        String str = hVar.f7473b;
        int i2 = hVar.f7472a;
        ByteBuffer byteBuffer = hVar.f7480i;
        AbstractC0562h abstractC0562h = (AbstractC0562h) ((HashMap) qVar.f5724e).get(str);
        if (abstractC0562h == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        InterfaceC0561g create = abstractC0562h.create(tVar.f5732i, i2, byteBuffer != null ? abstractC0562h.getCreateArgsCodec().b(byteBuffer) : null);
        View view = create.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(hVar.f7478g);
        tVar.f5738q.put(i2, create);
        h4.p pVar = tVar.f5733l;
        if (pVar == null) {
            return;
        }
        create.onFlutterViewAttached(pVar);
    }

    @Override // r4.k
    public void c(boolean z7) {
        ((u) this.f5724e).f5770z = z7;
    }

    public CharSequence d(r4.e eVar) {
        Activity activity = ((C0560f) this.f5724e).f5697a;
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (clipboardManager.hasPrimaryClip()) {
            try {
                try {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null) {
                        if (eVar != null) {
                            if (eVar == r4.e.f7466d) {
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
                            AssetFileDescriptor openTypedAssetFileDescriptor = activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(activity);
                            if (openTypedAssetFileDescriptor == null) {
                                return coerceToText;
                            }
                            try {
                                openTypedAssetFileDescriptor.close();
                                return coerceToText;
                            } catch (IOException e7) {
                                charSequence = coerceToText;
                                e = e7;
                                Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                return charSequence;
                            }
                        } catch (IOException e8) {
                            e = e8;
                            charSequence = text;
                        }
                    }
                } catch (IOException e9) {
                    e = e9;
                }
            } catch (FileNotFoundException unused) {
                Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                return charSequence;
            } catch (SecurityException e10) {
                Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e10);
                return charSequence;
            }
        }
        return null;
    }

    public void e(ArrayList arrayList) {
        C0560f c0560f = (C0560f) this.f5724e;
        if (c0560f.f5702f) {
            c0560f.f5702f = false;
            AbstractC1053a.E(c0560f.f5697a.getWindow(), true);
        }
        int i2 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            int ordinal = ((r4.g) arrayList.get(i5)).ordinal();
            if (ordinal == 0) {
                i2 &= -5;
            } else if (ordinal == 1) {
                i2 &= -515;
            }
        }
        c0560f.f5701e = i2;
        c0560f.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [io.flutter.plugin.platform.p, java.lang.Runnable] */
    @Override // r4.k
    public void f(r4.j jVar, final A4.b bVar) {
        j jVar2;
        u uVar = (u) this.f5724e;
        int l7 = uVar.l(jVar.f7497b);
        int l8 = uVar.l(jVar.f7498c);
        int i2 = jVar.f7496a;
        if (!uVar.j(i2)) {
            InterfaceC0561g interfaceC0561g = (InterfaceC0561g) uVar.f5764t.get(i2);
            l lVar = (l) uVar.f5767w.get(i2);
            if (interfaceC0561g == null || lVar == null) {
                Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i2);
                return;
            }
            if ((l7 > lVar.getRenderTargetWidth() || l8 > lVar.getRenderTargetHeight()) && (jVar2 = lVar.f5711n) != null) {
                jVar2.a(l7, l8);
            }
            ViewGroup.LayoutParams layoutParams = lVar.getLayoutParams();
            layoutParams.width = l7;
            layoutParams.height = l8;
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 51;
            }
            lVar.setLayoutParams(layoutParams);
            View view = interfaceC0561g.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = l7;
                layoutParams2.height = l8;
                view.setLayoutParams(layoutParams2);
            }
            int round = (int) Math.round(lVar.getRenderTargetWidth() / uVar.f());
            int round2 = (int) Math.round(lVar.getRenderTargetHeight() / uVar.f());
            r4.l lVar2 = (r4.l) bVar.f88e;
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(round));
            hashMap.put("height", Double.valueOf(round2));
            lVar2.success(hashMap);
            return;
        }
        final float f7 = uVar.f();
        final G g7 = (G) uVar.f5762r.get(Integer.valueOf(i2));
        io.flutter.plugin.editing.i iVar = uVar.f5759o;
        if (iVar != null) {
            if (iVar.f5657e.f4946b == 3) {
                iVar.f5667p = true;
            }
            SingleViewPresentation singleViewPresentation = g7.f5680a;
            if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                g7.f5680a.getView().onInputConnectionLocked();
            }
        }
        ?? r32 = new Runnable() { // from class: io.flutter.plugin.platform.p
            @Override // java.lang.Runnable
            public final void run() {
                u uVar2 = (u) q.this.f5724e;
                io.flutter.plugin.editing.i iVar2 = uVar2.f5759o;
                G g8 = g7;
                if (iVar2 != null) {
                    if (iVar2.f5657e.f4946b == 3) {
                        iVar2.f5667p = false;
                    }
                    SingleViewPresentation singleViewPresentation2 = g8.f5680a;
                    if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                        g8.f5680a.getView().onInputConnectionUnlocked();
                    }
                }
                double f8 = uVar2.f5755i == null ? f7 : uVar2.f();
                int round3 = (int) Math.round(g8.f5685f.getWidth() / f8);
                int round4 = (int) Math.round(g8.f5685f.getHeight() / f8);
                r4.l lVar3 = (r4.l) bVar.f88e;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("width", Double.valueOf(round3));
                hashMap2.put("height", Double.valueOf(round4));
                lVar3.success(hashMap2);
            }
        };
        j jVar3 = g7.f5685f;
        if (l7 == jVar3.getWidth() && l8 == g7.f5685f.getHeight()) {
            g7.a().postDelayed(r32, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            View a7 = g7.a();
            jVar3.a(l7, l8);
            g7.f5687h.resize(l7, l8, g7.f5683d);
            g7.f5687h.setSurface(jVar3.getSurface());
            a7.postDelayed(r32, 0L);
            return;
        }
        boolean isFocused = g7.a().isFocused();
        z detachState = g7.f5680a.detachState();
        g7.f5687h.setSurface(null);
        g7.f5687h.release();
        DisplayManager displayManager = (DisplayManager) g7.f5681b.getSystemService("display");
        jVar3.a(l7, l8);
        g7.f5687h = displayManager.createVirtualDisplay("flutter-vd#" + g7.f5684e, l7, l8, g7.f5683d, jVar3.getSurface(), 0, G.f5679i, null);
        View a8 = g7.a();
        a8.addOnAttachStateChangeListener(new D0.k(a8, (p) r32));
        SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(g7.f5681b, g7.f5687h.getDisplay(), g7.f5682c, detachState, g7.f5686g, isFocused);
        singleViewPresentation2.show();
        g7.f5680a.cancel();
        g7.f5680a = singleViewPresentation2;
    }

    public void g(int i2) {
        int i5;
        C0560f c0560f = (C0560f) this.f5724e;
        Activity activity = c0560f.f5697a;
        if (i2 != 4 && c0560f.f5702f) {
            c0560f.f5702f = false;
            AbstractC1053a.E(activity.getWindow(), true);
        }
        if (i2 == 1) {
            i5 = 1798;
        } else if (i2 == 2) {
            i5 = 3846;
        } else {
            if (i2 != 3) {
                if (i2 != 4 || Build.VERSION.SDK_INT < 29) {
                    return;
                }
                c0560f.f5702f = true;
                AbstractC1053a.E(activity.getWindow(), false);
                S1.a aVar = c0560f.f5700d;
                if (aVar != null) {
                    c0560f.a(aVar);
                    return;
                }
                return;
            }
            i5 = 5894;
        }
        c0560f.f5701e = i5;
        c0560f.b();
    }

    @Override // io.flutter.plugin.platform.j
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer) this.f5724e).getHeight();
    }

    @Override // io.flutter.plugin.platform.j
    public long getId() {
        return ((TextureRegistry$SurfaceProducer) this.f5724e).id();
    }

    @Override // io.flutter.plugin.platform.j
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer) this.f5724e).getSurface();
    }

    @Override // io.flutter.plugin.platform.j
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer) this.f5724e).getWidth();
    }

    @Override // r4.k
    public void h(int i2, double d7, double d8) {
        u uVar = (u) this.f5724e;
        if (uVar.j(i2)) {
            return;
        }
        l lVar = (l) uVar.f5767w.get(i2);
        if (lVar == null) {
            Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
            return;
        }
        int l7 = uVar.l(d7);
        int l8 = uVar.l(d8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lVar.getLayoutParams();
        layoutParams.topMargin = l7;
        layoutParams.leftMargin = l8;
        layoutParams.gravity = 51;
        lVar.setLayoutParams(layoutParams);
    }

    @Override // r4.k
    public void i(int i2, int i5) {
        View view;
        switch (this.f5723d) {
            case 0:
                u uVar = (u) this.f5724e;
                if (i5 != 0 && i5 != 1) {
                    throw new IllegalStateException("Trying to set unknown direction value: " + i5 + "(view id: " + i2 + ")");
                }
                if (uVar.j(i2)) {
                    view = ((G) uVar.f5762r.get(Integer.valueOf(i2))).a();
                } else {
                    InterfaceC0561g interfaceC0561g = (InterfaceC0561g) uVar.f5764t.get(i2);
                    if (interfaceC0561g == null) {
                        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i2);
                        return;
                    }
                    view = interfaceC0561g.getView();
                }
                if (view != null) {
                    view.setLayoutDirection(i5);
                    return;
                }
                Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i2);
                return;
            default:
                InterfaceC0561g interfaceC0561g2 = (InterfaceC0561g) ((t) this.f5724e).f5738q.get(i2);
                if (interfaceC0561g2 == null) {
                    Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + i2);
                    return;
                }
                View view2 = interfaceC0561g2.getView();
                if (view2 != null) {
                    view2.setLayoutDirection(i5);
                    return;
                }
                Log.e("PlatformViewsController2", "Setting direction to a null view with id: " + i2);
                return;
        }
    }

    public void j(int i2) {
        View decorView = ((C0560f) this.f5724e).f5697a.getWindow().getDecorView();
        switch (S.i.b(i2)) {
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
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                    break;
                }
                break;
        }
    }

    @Override // r4.k
    public void k(r4.h hVar) {
        u uVar = (u) this.f5724e;
        u.a(uVar, hVar);
        if (uVar.f5757m.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        uVar.b(hVar, false);
        if (uVar.f5757m.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
    }

    @Override // r4.k
    public void l(r4.i iVar) {
        switch (this.f5723d) {
            case 0:
                int i2 = iVar.f7481a;
                u uVar = (u) this.f5724e;
                float f7 = uVar.f5755i.getResources().getDisplayMetrics().density;
                if (!uVar.j(i2)) {
                    InterfaceC0561g interfaceC0561g = (InterfaceC0561g) uVar.f5764t.get(i2);
                    if (interfaceC0561g == null) {
                        Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i2);
                        break;
                    } else {
                        View view = interfaceC0561g.getView();
                        if (view == null) {
                            Log.e("PlatformViewsController", "Sending touch to a null view with id: " + i2);
                            break;
                        } else {
                            view.dispatchTouchEvent(uVar.k(f7, iVar, false));
                            break;
                        }
                    }
                } else {
                    G g7 = (G) uVar.f5762r.get(Integer.valueOf(i2));
                    MotionEvent k7 = uVar.k(f7, iVar, true);
                    SingleViewPresentation singleViewPresentation = g7.f5680a;
                    if (singleViewPresentation != null) {
                        singleViewPresentation.dispatchTouchEvent(k7);
                        break;
                    }
                }
                break;
            default:
                int i5 = iVar.f7481a;
                t tVar = (t) this.f5724e;
                float f8 = tVar.f5732i.getResources().getDisplayMetrics().density;
                InterfaceC0561g interfaceC0561g2 = (InterfaceC0561g) tVar.f5738q.get(i5);
                if (interfaceC0561g2 == null) {
                    Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + i5);
                    break;
                } else {
                    View view2 = interfaceC0561g2.getView();
                    if (view2 == null) {
                        Log.e("PlatformViewsController2", "Sending touch to a null view with id: " + i5);
                        break;
                    } else {
                        long j = iVar.f7495p;
                        int i7 = iVar.f7485e;
                        MotionEvent x7 = tVar.f5740s.x(new C0483D(j));
                        List<List> list = (List) iVar.f7487g;
                        ArrayList arrayList = new ArrayList();
                        for (List list2 : list) {
                            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
                            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
                            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
                            double d7 = f8;
                            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d7);
                            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d7);
                            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d7);
                            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d7);
                            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d7);
                            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d7);
                            arrayList.add(pointerCoords);
                        }
                        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i7]);
                        if (x7 == null) {
                            List<List> list3 = (List) iVar.f7486f;
                            ArrayList arrayList2 = new ArrayList();
                            for (List list4 : list3) {
                                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                                pointerProperties.id = ((Integer) list4.get(0)).intValue();
                                pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
                                arrayList2.add(pointerProperties);
                            }
                            x7 = MotionEvent.obtain(iVar.f7482b.longValue(), iVar.f7483c.longValue(), iVar.f7484d, iVar.f7485e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i7]), pointerCoordsArr, iVar.f7488h, iVar.f7489i, iVar.j, iVar.f7490k, iVar.f7491l, iVar.f7492m, iVar.f7493n, iVar.f7494o);
                        } else if (pointerCoordsArr.length >= 1) {
                            x7.offsetLocation(pointerCoordsArr[0].x - x7.getX(), pointerCoordsArr[0].y - x7.getY());
                        }
                        view2.dispatchTouchEvent(x7);
                        break;
                    }
                }
        }
    }

    @Override // r4.k
    public void n(int i2) {
        View view;
        switch (this.f5723d) {
            case 0:
                u uVar = (u) this.f5724e;
                if (uVar.j(i2)) {
                    view = ((G) uVar.f5762r.get(Integer.valueOf(i2))).a();
                } else {
                    InterfaceC0561g interfaceC0561g = (InterfaceC0561g) uVar.f5764t.get(i2);
                    if (interfaceC0561g == null) {
                        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i2);
                        break;
                    } else {
                        view = interfaceC0561g.getView();
                    }
                }
                if (view != null) {
                    view.clearFocus();
                    break;
                } else {
                    Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i2);
                    break;
                }
            default:
                InterfaceC0561g interfaceC0561g2 = (InterfaceC0561g) ((t) this.f5724e).f5738q.get(i2);
                if (interfaceC0561g2 != null) {
                    View view2 = interfaceC0561g2.getView();
                    if (view2 != null) {
                        view2.clearFocus();
                        break;
                    } else {
                        Log.e("PlatformViewsController2", "Clearing focus on a null view with id: " + i2);
                        break;
                    }
                } else {
                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + i2);
                    break;
                }
        }
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [io.flutter.plugin.platform.o] */
    @Override // r4.k
    public long p(final r4.h hVar) {
        long id;
        l lVar;
        final u uVar = (u) this.f5724e;
        u.a(uVar, hVar);
        double d7 = hVar.f7475d;
        double d8 = hVar.f7474c;
        int i2 = hVar.f7472a;
        SparseArray sparseArray = uVar.f5767w;
        if (sparseArray.get(i2) != null) {
            throw new IllegalStateException(C4.p.g(i2, "Trying to create an already created platform view, view id: "));
        }
        if (uVar.f5758n == null) {
            throw new IllegalStateException(C4.p.g(i2, "Texture registry is null. This means that platform views controller was detached, view id: "));
        }
        if (uVar.f5756l == null) {
            throw new IllegalStateException(C4.p.g(i2, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
        }
        final int i5 = 1;
        InterfaceC0561g b7 = uVar.b(hVar, true);
        View view = b7.getView();
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        if (O6.g.b0(view, new A4.b(0, u.f5747F))) {
            if (hVar.f7479h == 2) {
                if (uVar.f5757m.IsSurfaceControlEnabled()) {
                    throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
                }
                return -2L;
            }
            if (!uVar.f5751D) {
                j h7 = u.h(uVar.f5758n);
                int l7 = uVar.l(d8);
                int l8 = uVar.l(d7);
                AbstractActivityC0488c abstractActivityC0488c = uVar.f5755i;
                C0555a c0555a = uVar.f5761q;
                int i7 = hVar.f7472a;
                ?? r62 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.o
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z7) {
                        switch (i5) {
                            case 0:
                                int i8 = hVar.f7472a;
                                u uVar2 = uVar;
                                if (!z7) {
                                    io.flutter.plugin.editing.i iVar = uVar2.f5759o;
                                    if (iVar != null) {
                                        iVar.b(i8);
                                        break;
                                    }
                                } else {
                                    s4.q qVar = (s4.q) uVar2.f5760p.f2251d;
                                    if (qVar != null) {
                                        qVar.a("viewFocused", Integer.valueOf(i8), null);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (z7) {
                                    P0.s sVar = uVar.f5760p;
                                    int i9 = hVar.f7472a;
                                    s4.q qVar2 = (s4.q) sVar.f2251d;
                                    if (qVar2 != null) {
                                        qVar2.a("viewFocused", Integer.valueOf(i9), null);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
                D d9 = G.f5679i;
                G g7 = null;
                if (l7 != 0 && l8 != 0) {
                    DisplayManager displayManager = (DisplayManager) abstractActivityC0488c.getSystemService("display");
                    DisplayMetrics displayMetrics = abstractActivityC0488c.getResources().getDisplayMetrics();
                    h7.a(l7, l8);
                    VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay(C4.p.g(i7, "flutter-vd#"), l7, l8, displayMetrics.densityDpi, h7.getSurface(), 0, G.f5679i, null);
                    if (createVirtualDisplay != null) {
                        g7 = new G(abstractActivityC0488c, c0555a, createVirtualDisplay, b7, h7, r62, i7);
                    }
                }
                if (g7 != null) {
                    uVar.f5762r.put(Integer.valueOf(i2), g7);
                    View view2 = b7.getView();
                    uVar.f5763s.put(view2.getContext(), view2);
                    return h7.getId();
                }
                throw new IllegalStateException("Failed creating virtual display for a " + hVar.f7473b + " with id: " + i2);
            }
        }
        int l9 = uVar.l(d8);
        int l10 = uVar.l(d7);
        if (uVar.f5751D) {
            lVar = new l(uVar.f5755i);
            id = -1;
        } else {
            j h8 = u.h(uVar.f5758n);
            l lVar2 = new l(uVar.f5755i);
            lVar2.f5711n = h8;
            Surface surface = h8.getSurface();
            if (surface != null) {
                Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                } finally {
                    surface.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
            id = h8.getId();
            lVar = lVar2;
        }
        lVar.setTouchProcessor(uVar.f5754e);
        j jVar = lVar.f5711n;
        if (jVar != null) {
            jVar.a(l9, l10);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(l9, l10, 51);
        int l11 = uVar.l(hVar.f7476e);
        long j = id;
        int l12 = uVar.l(hVar.f7477f);
        layoutParams.topMargin = l11;
        layoutParams.leftMargin = l12;
        lVar.setLayoutParams(layoutParams);
        View view3 = b7.getView();
        view3.setLayoutParams(new FrameLayout.LayoutParams(l9, l10));
        view3.setImportantForAccessibility(4);
        lVar.addView(view3);
        final int i8 = 0;
        lVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.o
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view22, boolean z7) {
                switch (i8) {
                    case 0:
                        int i82 = hVar.f7472a;
                        u uVar2 = uVar;
                        if (!z7) {
                            io.flutter.plugin.editing.i iVar = uVar2.f5759o;
                            if (iVar != null) {
                                iVar.b(i82);
                                break;
                            }
                        } else {
                            s4.q qVar = (s4.q) uVar2.f5760p.f2251d;
                            if (qVar != null) {
                                qVar.a("viewFocused", Integer.valueOf(i82), null);
                                break;
                            }
                        }
                        break;
                    default:
                        if (z7) {
                            P0.s sVar = uVar.f5760p;
                            int i9 = hVar.f7472a;
                            s4.q qVar2 = (s4.q) sVar.f2251d;
                            if (qVar2 != null) {
                                qVar2.a("viewFocused", Integer.valueOf(i9), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        uVar.f5756l.addView(lVar);
        sparseArray.append(i2, lVar);
        h4.p pVar = uVar.f5756l;
        if (pVar == null) {
            return j;
        }
        b7.onFlutterViewAttached(pVar);
        return j;
    }

    @Override // r4.k
    public void r(r4.h hVar) {
        throw new IllegalStateException("Trying to create an HC++ platform view from within PlatformViewsController1. Request: " + hVar);
    }

    @Override // io.flutter.plugin.platform.j
    public void release() {
        ((TextureRegistry$SurfaceProducer) this.f5724e).release();
        this.f5724e = null;
    }

    @Override // r4.k
    public void s(int i2) {
        k kVar;
        switch (this.f5723d) {
            case 0:
                u uVar = (u) this.f5724e;
                SparseArray sparseArray = uVar.f5765u;
                SparseArray sparseArray2 = uVar.f5767w;
                HashMap hashMap = uVar.f5762r;
                SparseArray sparseArray3 = uVar.f5764t;
                InterfaceC0561g interfaceC0561g = (InterfaceC0561g) sparseArray3.get(i2);
                if (interfaceC0561g != null) {
                    if (interfaceC0561g.getView() != null) {
                        View view = interfaceC0561g.getView();
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                    }
                    sparseArray3.remove(i2);
                    try {
                        interfaceC0561g.dispose();
                    } catch (RuntimeException e7) {
                        Log.e("PlatformViewsController", "Disposing platform view threw an exception", e7);
                    }
                    if (!uVar.j(i2)) {
                        l lVar = (l) sparseArray2.get(i2);
                        if (lVar == null) {
                            C0758a c0758a = (C0758a) sparseArray.get(i2);
                            if (c0758a != null) {
                                c0758a.removeAllViews();
                                c0758a.a();
                                ViewGroup viewGroup2 = (ViewGroup) c0758a.getParent();
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(c0758a);
                                }
                                sparseArray.remove(i2);
                                break;
                            }
                        } else {
                            lVar.removeAllViews();
                            j jVar = lVar.f5711n;
                            if (jVar != null) {
                                jVar.release();
                                lVar.f5711n = null;
                            }
                            ViewTreeObserver viewTreeObserver = lVar.getViewTreeObserver();
                            if (viewTreeObserver.isAlive() && (kVar = lVar.f5712o) != null) {
                                lVar.f5712o = null;
                                viewTreeObserver.removeOnGlobalFocusChangeListener(kVar);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) lVar.getParent();
                            if (viewGroup3 != null) {
                                viewGroup3.removeView(lVar);
                            }
                            sparseArray2.remove(i2);
                            break;
                        }
                    } else {
                        G g7 = (G) hashMap.get(Integer.valueOf(i2));
                        View a7 = g7.a();
                        if (a7 != null) {
                            uVar.f5763s.remove(a7.getContext());
                        }
                        g7.f5680a.cancel();
                        g7.f5680a.detachState();
                        g7.f5687h.release();
                        g7.f5685f.release();
                        hashMap.remove(Integer.valueOf(i2));
                        break;
                    }
                } else {
                    Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i2);
                    break;
                }
                break;
            default:
                t tVar = (t) this.f5724e;
                tVar.f5745x.remove(Integer.valueOf(i2));
                InterfaceC0561g interfaceC0561g2 = (InterfaceC0561g) tVar.f5738q.get(i2);
                if (interfaceC0561g2 != null) {
                    if (interfaceC0561g2.getView() != null) {
                        View view2 = interfaceC0561g2.getView();
                        ViewGroup viewGroup4 = (ViewGroup) view2.getParent();
                        if (viewGroup4 != null) {
                            viewGroup4.removeView(view2);
                        }
                    }
                    tVar.f5738q.remove(i2);
                    try {
                        interfaceC0561g2.dispose();
                    } catch (RuntimeException e8) {
                        Log.e("PlatformViewsController2", "Disposing platform view threw an exception", e8);
                    }
                    C0758a c0758a2 = (C0758a) tVar.f5739r.get(i2);
                    if (c0758a2 != null) {
                        c0758a2.removeAllViews();
                        c0758a2.a();
                        ViewGroup viewGroup5 = (ViewGroup) c0758a2.getParent();
                        if (viewGroup5 != null) {
                            viewGroup5.removeView(c0758a2);
                        }
                        tVar.f5739r.remove(i2);
                        break;
                    }
                } else {
                    Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i2);
                    break;
                }
                break;
        }
    }

    @Override // io.flutter.plugin.platform.j
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer) this.f5724e).scheduleFrame();
    }

    @Override // r4.k
    public boolean t() {
        return false;
    }

    public q(int i2) {
        this.f5723d = i2;
        switch (i2) {
            case 4:
                break;
            default:
                this.f5724e = new HashMap();
                break;
        }
    }
}
