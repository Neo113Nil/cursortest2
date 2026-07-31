package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.io.FileNotFoundException;
import java.util.List;
import l5.i;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f17348a;

    /* renamed from: b, reason: collision with root package name */
    private final l5.i f17349b;

    /* renamed from: c, reason: collision with root package name */
    private final d f17350c;

    /* renamed from: d, reason: collision with root package name */
    private i.j f17351d;

    /* renamed from: e, reason: collision with root package name */
    private int f17352e;

    /* renamed from: f, reason: collision with root package name */
    final i.h f17353f;

    class a implements i.h {
        a() {
        }

        @Override // l5.i.h
        public void a(i.c cVar) {
            b.this.u(cVar);
        }

        @Override // l5.i.h
        public void b() {
            b.this.r();
        }

        @Override // l5.i.h
        public void c(i.EnumC0095i enumC0095i) {
            b.this.q(enumC0095i);
        }

        @Override // l5.i.h
        public void d(List<i.l> list) {
            b.this.x(list);
        }

        @Override // l5.i.h
        public void e(i.g gVar) {
            b.this.B(gVar);
        }

        @Override // l5.i.h
        public CharSequence f(i.e eVar) {
            return b.this.p(eVar);
        }

        @Override // l5.i.h
        public void g() {
            b.this.v();
        }

        @Override // l5.i.h
        public void h() {
            b.this.s();
        }

        @Override // l5.i.h
        public void i(String str) {
            b.this.t(str);
        }

        @Override // l5.i.h
        public void j(i.j jVar) {
            b.this.z(jVar);
        }

        @Override // l5.i.h
        public void k(i.k kVar) {
            b.this.w(kVar);
        }

        @Override // l5.i.h
        public void l(int i7) {
            b.this.y(i7);
        }

        @Override // l5.i.h
        public boolean m() {
            return b.this.n();
        }
    }

    /* renamed from: io.flutter.plugin.platform.b$b, reason: collision with other inner class name */
    class ViewOnSystemUiVisibilityChangeListenerC0073b implements View.OnSystemUiVisibilityChangeListener {
        ViewOnSystemUiVisibilityChangeListenerC0073b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i7) {
            l5.i iVar;
            boolean z6;
            if ((i7 & 4) == 0) {
                iVar = b.this.f17349b;
                z6 = false;
            } else {
                iVar = b.this.f17349b;
                z6 = true;
            }
            iVar.m(z6);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17356a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f17357b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f17358c;

        static {
            int[] iArr = new int[i.d.values().length];
            f17358c = iArr;
            try {
                iArr[i.d.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17358c[i.d.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[i.l.values().length];
            f17357b = iArr2;
            try {
                iArr2[i.l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17357b[i.l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[i.g.values().length];
            f17356a = iArr3;
            try {
                iArr3[i.g.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17356a[i.g.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17356a[i.g.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17356a[i.g.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17356a[i.g.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public interface d {
        boolean b();
    }

    public b(Activity activity, l5.i iVar, d dVar) {
        a aVar = new a();
        this.f17353f = aVar;
        this.f17348a = activity;
        this.f17349b = iVar;
        iVar.l(aVar);
        this.f17350c = dVar;
        this.f17352e = 1280;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f17348a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence p(i.e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f17348a.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip == null) {
                return null;
            }
            if (eVar != null && eVar != i.e.PLAIN_TEXT) {
                return null;
            }
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt.getUri() != null) {
                this.f17348a.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", null);
            }
            return itemAt.coerceToText(this.f17348a);
        } catch (FileNotFoundException unused) {
            return null;
        } catch (SecurityException e7) {
            z4.b.g("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e7);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(i.EnumC0095i enumC0095i) {
        if (enumC0095i == i.EnumC0095i.CLICK) {
            this.f17348a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void r() {
        d dVar = this.f17350c;
        if (dVar == null || !dVar.b()) {
            Activity activity = this.f17348a;
            if (activity instanceof androidx.activity.c) {
                ((androidx.activity.c) activity).h().c();
            } else {
                activity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(String str) {
        ((ClipboardManager) this.f17348a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(i.c cVar) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 21) {
            return;
        }
        if (i7 < 28 && i7 > 21) {
            this.f17348a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f18664b, (Bitmap) null, cVar.f18663a));
        }
        if (i7 >= 28) {
            this.f17348a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f18664b, 0, cVar.f18663a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.f17348a.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC0073b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(i.k kVar) {
        int i7;
        if (kVar == i.k.LEAN_BACK) {
            i7 = 1798;
        } else if (kVar == i.k.IMMERSIVE && Build.VERSION.SDK_INT >= 19) {
            i7 = 3846;
        } else if (kVar == i.k.IMMERSIVE_STICKY && Build.VERSION.SDK_INT >= 19) {
            i7 = 5894;
        } else if (kVar != i.k.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i7 = 1792;
        }
        this.f17352e = i7;
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(List<i.l> list) {
        int i7 = (list.size() != 0 || Build.VERSION.SDK_INT < 19) ? 1798 : 5894;
        for (int i8 = 0; i8 < list.size(); i8++) {
            int i9 = c.f17357b[list.get(i8).ordinal()];
            if (i9 == 1) {
                i7 &= -5;
            } else if (i9 == 2) {
                i7 = i7 & (-513) & (-3);
            }
        }
        this.f17352e = i7;
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(int i7) {
        this.f17348a.setRequestedOrientation(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(21)
    public void z(i.j jVar) {
        Window window = this.f17348a.getWindow();
        androidx.core.view.l lVar = new androidx.core.view.l(window, window.getDecorView());
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if (i7 >= 23) {
            i.d dVar = jVar.f18690b;
            if (dVar != null) {
                int i8 = c.f17358c[dVar.ordinal()];
                if (i8 == 1) {
                    lVar.b(true);
                } else if (i8 == 2) {
                    lVar.b(false);
                }
            }
            Integer num = jVar.f18689a;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = jVar.f18691c;
        if (bool != null && i7 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i7 >= 26) {
            i.d dVar2 = jVar.f18693e;
            if (dVar2 != null) {
                int i9 = c.f17358c[dVar2.ordinal()];
                if (i9 == 1) {
                    lVar.a(true);
                } else if (i9 == 2) {
                    lVar.a(false);
                }
            }
            Integer num2 = jVar.f18692d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = jVar.f18694f;
        if (num3 != null && i7 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = jVar.f18695g;
        if (bool2 != null && i7 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f17351d = jVar;
    }

    public void A() {
        this.f17348a.getWindow().getDecorView().setSystemUiVisibility(this.f17352e);
        i.j jVar = this.f17351d;
        if (jVar != null) {
            z(jVar);
        }
    }

    void B(i.g gVar) {
        int i7;
        View decorView = this.f17348a.getWindow().getDecorView();
        int i8 = c.f17356a[gVar.ordinal()];
        int i9 = 1;
        if (i8 != 1) {
            if (i8 != 2) {
                i9 = 3;
                if (i8 != 3) {
                    i9 = 4;
                    if (i8 != 4) {
                        if (i8 != 5 || Build.VERSION.SDK_INT < 21) {
                            return;
                        }
                    } else if (Build.VERSION.SDK_INT < 23) {
                        return;
                    } else {
                        i7 = 6;
                    }
                }
            }
            decorView.performHapticFeedback(i9);
            return;
        }
        i7 = 0;
        decorView.performHapticFeedback(i7);
    }

    public void o() {
        this.f17349b.l(null);
    }
}
