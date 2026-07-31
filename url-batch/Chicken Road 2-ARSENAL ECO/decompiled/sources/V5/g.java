package V5;

import a.AbstractC0219a;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import k.O;
import n6.y;
import u0.AbstractC0676f;
import u0.C0675e;
import x5.InterfaceC0748q;

/* loaded from: classes.dex */
public final class g implements io.flutter.plugin.editing.a, N3.i, O {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2733f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2734g;

    public /* synthetic */ g(int i7, Object obj) {
        this.f2733f = i7;
        this.f2734g = obj;
    }

    @Override // N3.i
    public void a(D4.h hVar) {
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) this.f2734g;
        io.flutter.plugin.platform.l.a(lVar, hVar);
        if (lVar.f4578i.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        E3.j jVar = lVar.f4575f;
        String str = (String) hVar.f529c;
        if (jVar.f659a.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException(C1.c.h("Trying to create a platform view of unregistered type: ", str));
    }

    @Override // N3.i
    public void b(boolean z5) {
        ((io.flutter.plugin.platform.l) this.f2734g).f4591v = z5;
    }

    @Override // k.O
    public void c(j.j jVar, MenuItem menuItem) {
        ((j.g) this.f2734g).f4773k.removeCallbacksAndMessages(jVar);
    }

    @Override // N3.i
    public void d(int i7, double d7, double d8) {
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) this.f2734g;
        if (lVar.g(i7)) {
            return;
        }
        Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i7);
    }

    @Override // N3.i
    public void e(int i7, int i8) {
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) this.f2734g;
        if (i8 != 0 && i8 != 1) {
            throw new IllegalStateException("Trying to set unknown direction value: " + i8 + "(view id: " + i7 + ")");
        }
        if (lVar.g(i7)) {
            ((io.flutter.plugin.platform.r) lVar.f4583n.get(Integer.valueOf(i7))).getClass();
            Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i7);
            return;
        }
        if (lVar.f4585p.get(i7) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i7);
    }

    @Override // N3.i
    public void f(N3.h hVar, B1.g gVar) {
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) this.f2734g;
        int f7 = lVar.f(hVar.f1715b);
        int f8 = lVar.f(hVar.f1716c);
        int i7 = hVar.f1714a;
        if (!lVar.g(i7)) {
            if (lVar.f4585p.get(i7) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i7);
            return;
        }
        float f9 = lVar.f4576g.getResources().getDisplayMetrics().density;
        io.flutter.plugin.platform.r rVar = (io.flutter.plugin.platform.r) lVar.f4583n.get(Integer.valueOf(i7));
        io.flutter.plugin.editing.i iVar = lVar.f4580k;
        if (iVar != null) {
            if (iVar.f4537e.f299a == 3) {
                iVar.f4548p = true;
            }
            rVar.getClass();
        }
        rVar.getClass();
        if (f7 == 0 && f8 == 0) {
            throw null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw null;
        }
        throw null;
    }

    @Override // k.O
    public void g(j.j jVar, j.k kVar) {
        j.g gVar = (j.g) this.f2734g;
        Handler handler = gVar.f4773k;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f4775m;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (jVar == ((j.f) arrayList.get(i7)).f4762b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        int i8 = i7 + 1;
        handler.postAtTime(new j.e(this, i8 < arrayList.size() ? (j.f) arrayList.get(i8) : null, kVar, jVar, 0), jVar, SystemClock.uptimeMillis() + 200);
    }

    public long h() {
        return ((z3.a) this.f2734g).c();
    }

    public n6.i i(long j4) {
        return ((z3.a) this.f2734g).d((int) j4);
    }

    @Override // N3.i
    public void j(int i7) {
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) this.f2734g;
        if (lVar.g(i7)) {
            ((io.flutter.plugin.platform.r) lVar.f4583n.get(Integer.valueOf(i7))).getClass();
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i7);
            return;
        }
        if (lVar.f4585p.get(i7) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i7);
    }

    public CharSequence k(N3.d dVar) {
        Activity activity = ((io.flutter.plugin.platform.f) this.f2734g).f4555a;
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (clipboardManager.hasPrimaryClip()) {
            try {
                try {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null) {
                        if (dVar != null) {
                            if (dVar == N3.d.f1685f) {
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
                            } catch (IOException e4) {
                                charSequence = coerceToText;
                                e = e4;
                                Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                return charSequence;
                            }
                        } catch (IOException e7) {
                            e = e7;
                            charSequence = text;
                        }
                    }
                } catch (IOException e8) {
                    e = e8;
                }
            } catch (FileNotFoundException unused) {
                Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                return charSequence;
            } catch (SecurityException e9) {
                Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e9);
                return charSequence;
            }
        }
        return null;
    }

    @Override // N3.i
    public void l(N3.g gVar) {
        int i7 = gVar.f1698a;
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) this.f2734g;
        float f7 = lVar.f4576g.getResources().getDisplayMetrics().density;
        if (!lVar.g(i7)) {
            if (lVar.f4585p.get(i7) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i7);
            return;
        }
        io.flutter.plugin.platform.r rVar = (io.flutter.plugin.platform.r) lVar.f4583n.get(Integer.valueOf(i7));
        long j4 = gVar.f1713p;
        int i8 = gVar.f1702e;
        C0675e c0675e = lVar.y;
        c0675e.getClass();
        LongSparseArray longSparseArray = (LongSparseArray) c0675e.f5975b;
        PriorityQueue priorityQueue = (PriorityQueue) c0675e.f5976c;
        while (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() < j4) {
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j4) {
            priorityQueue.poll();
        }
        longSparseArray.remove(j4);
        List<List> list = (List) gVar.f1704g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d7 = f7;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d7);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d7);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d7);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d7);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d7);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d7);
            arrayList.add(pointerCoords);
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i8]);
        List<List> list3 = (List) gVar.f1703f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.obtain(gVar.f1699b.longValue(), gVar.f1700c.longValue(), gVar.f1701d, gVar.f1702e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i8]), pointerCoordsArr, gVar.f1705h, gVar.f1706i, gVar.f1707j, gVar.f1708k, gVar.f1709l, gVar.f1710m, gVar.f1711n, gVar.f1712o);
        rVar.getClass();
    }

    @Override // N3.i
    public long m(D4.h hVar) {
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) this.f2734g;
        io.flutter.plugin.platform.l.a(lVar, hVar);
        int i7 = hVar.f527a;
        if (lVar.f4588s.get(i7) != null) {
            throw new IllegalStateException(W4.o.c("Trying to create an already created platform view, view id: ", i7));
        }
        if (lVar.f4579j == null) {
            throw new IllegalStateException(W4.o.c("Texture registry is null. This means that platform views controller was detached, view id: ", i7));
        }
        if (lVar.f4577h == null) {
            throw new IllegalStateException(W4.o.c("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ", i7));
        }
        E3.j jVar = lVar.f4575f;
        String str = (String) hVar.f529c;
        if (jVar.f659a.get(str) == null) {
            throw new IllegalStateException(C1.c.h("Trying to create a platform view of unregistered type: ", str));
        }
        throw new ClassCastException();
    }

    @Override // N3.i
    public void n(int i7) {
        if (((io.flutter.plugin.platform.l) this.f2734g).f4585p.get(i7) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i7);
    }

    public void o(int i7) {
        ((z3.a) this.f2734g).k(i7);
    }

    @Override // N3.i
    public boolean p() {
        return false;
    }

    @Override // N3.i
    public void q(D4.h hVar) {
        throw new IllegalStateException("Trying to create an HC++ platform view from within PlatformViewsController1. Request: " + hVar);
    }

    public void r(ArrayList arrayList) {
        io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) this.f2734g;
        if (fVar.f4560f) {
            fVar.f4560f = false;
            AbstractC0676f.s(fVar.f4555a.getWindow(), true);
        }
        int i7 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            int ordinal = ((N3.f) arrayList.get(i8)).ordinal();
            if (ordinal == 0) {
                i7 &= -5;
            } else if (ordinal == 1) {
                i7 &= -515;
            }
        }
        fVar.f4559e = i7;
        fVar.b();
    }

    public void s(int i7) {
        int i8;
        io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) this.f2734g;
        Activity activity = fVar.f4555a;
        if (i7 != 4 && fVar.f4560f) {
            fVar.f4560f = false;
            AbstractC0676f.s(activity.getWindow(), true);
        }
        if (i7 == 1) {
            i8 = 1798;
        } else if (i7 == 2) {
            i8 = 3846;
        } else {
            if (i7 != 3) {
                if (i7 != 4 || Build.VERSION.SDK_INT < 29) {
                    return;
                }
                fVar.f4560f = true;
                AbstractC0676f.s(activity.getWindow(), false);
                N3.e eVar = fVar.f4558d;
                if (eVar != null) {
                    fVar.a(eVar);
                    return;
                }
                return;
            }
            i8 = 5894;
        }
        fVar.f4559e = i8;
        fVar.b();
    }

    public void t(int i7) {
        View decorView = ((io.flutter.plugin.platform.f) this.f2734g).f4555a.getWindow().getDecorView();
        switch (N.p.c(i7)) {
            case 0:
                decorView.performHapticFeedback(0);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                decorView.performHapticFeedback(1);
                break;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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

    public String toString() {
        switch (this.f2733f) {
            case 5:
                return "ServiceLoaderComponentLoader{classLoader=" + ((ClassLoader) this.f2734g) + "}";
            default:
                return super.toString();
        }
    }

    public void u(OutputStream stream) {
        G4.d dVar = (G4.d) this.f2734g;
        int i7 = dVar.f858c;
        z3.c cVar = z3.i.f6310g;
        Integer valueOf = Integer.valueOf(i7);
        cVar.getClass();
        kotlin.jvm.internal.i.e(stream, "stream");
        n6.n nVar = new n6.n(stream, new y());
        n6.f fVar = new n6.f();
        z3.l writer = new z3.l();
        cVar.getClass();
        int intValue = valueOf.intValue();
        kotlin.jvm.internal.i.e(writer, "writer");
        if (intValue >= 0) {
            int i8 = (intValue & (-128)) == 0 ? 1 : (intValue & (-16384)) == 0 ? 2 : ((-2097152) & intValue) == 0 ? 3 : ((-268435456) & intValue) == 0 ? 4 : 5;
            writer.b(i8);
            int i9 = writer.f6334e - i8;
            writer.f6334e = i9;
            while ((intValue & (-128)) != 0) {
                writer.f6333d[i9] = (byte) ((intValue & 127) | 128);
                intValue >>>= 7;
                i9++;
            }
            writer.f6333d[i9] = (byte) intValue;
        } else {
            long j4 = intValue;
            int F6 = AbstractC0219a.F(j4);
            writer.b(F6);
            int i10 = writer.f6334e - F6;
            writer.f6334e = i10;
            while (((-128) & j4) != 0) {
                writer.f6333d[i10] = (byte) ((127 & j4) | 128);
                j4 >>>= 7;
                i10++;
            }
            writer.f6333d[i10] = (byte) j4;
        }
        writer.a();
        n6.f fVar2 = writer.f6330a;
        while (fVar2.i(8192L, fVar) != -1) {
            long j7 = fVar.f5524g;
            if (j7 == 0) {
                j7 = 0;
            } else {
                n6.r rVar = fVar.f5523f;
                kotlin.jvm.internal.i.b(rVar);
                n6.r rVar2 = rVar.f5556g;
                kotlin.jvm.internal.i.b(rVar2);
                if (rVar2.f5552c < 8192 && rVar2.f5554e) {
                    j7 -= r9 - rVar2.f5551b;
                }
            }
            if (j7 > 0) {
                nVar.l(j7, fVar);
            }
        }
        long j8 = fVar.f5524g;
        if (j8 > 0) {
            nVar.l(j8, fVar);
        }
        dVar.b(stream);
    }

    public g(int i7) {
        this.f2733f = i7;
        switch (i7) {
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                break;
            case 12:
                this.f2734g = new G4.d();
                break;
            default:
                this.f2734g = new ConcurrentHashMap(16);
                break;
        }
    }

    public g(WorkDatabase workDatabase) {
        this.f2733f = 13;
        kotlin.jvm.internal.i.e(workDatabase, "workDatabase");
        this.f2734g = workDatabase;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X5.g] */
    public g(final int i7, final int i8, final int i9, final int i10, final boolean z5, final boolean z6, final a6.d dVar) {
        this.f2733f = 1;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        final a6.e taskRunner = a6.e.f3174l;
        kotlin.jvm.internal.i.e(timeUnit, "timeUnit");
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        this.f2734g = new b6.s(taskRunner, timeUnit, b6.f.f3650a, new InterfaceC0748q() { // from class: X5.g
            @Override // x5.InterfaceC0748q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                b6.s pool = (b6.s) obj;
                C0217a address = (C0217a) obj2;
                b6.a user = (b6.a) obj3;
                kotlin.jvm.internal.i.e(pool, "pool");
                kotlin.jvm.internal.i.e(address, "address");
                kotlin.jvm.internal.i.e(user, "user");
                a6.e eVar = a6.e.this;
                return new b6.l(new b6.m(new b6.t(eVar, pool, i7, i8, i9, i10, z5, z6, address, dVar, user)), eVar);
            }
        });
    }

    public g(z3.a aVar) {
        this.f2733f = 15;
        new ArrayList();
        this.f2734g = aVar;
    }
}
