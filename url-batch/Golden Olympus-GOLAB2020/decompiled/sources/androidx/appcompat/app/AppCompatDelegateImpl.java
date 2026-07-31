package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C1259h;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC1276z;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.Z;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.k0;
import androidx.core.app.AbstractC1278b;
import androidx.core.content.res.f;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.AbstractC1305m0;
import androidx.core.view.AbstractC1319u;
import androidx.core.view.AbstractC1321v;
import androidx.core.view.C1301k0;
import androidx.core.view.J;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.InterfaceC1354u;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import e.AbstractC2405a;
import e.AbstractC2407c;
import f.AbstractC2415a;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class AppCompatDelegateImpl extends androidx.appcompat.app.g implements e.a, LayoutInflater.Factory2 {

    /* renamed from: k0, reason: collision with root package name */
    private static final androidx.collection.g f10032k0 = new androidx.collection.g();

    /* renamed from: l0, reason: collision with root package name */
    private static final boolean f10033l0 = false;

    /* renamed from: m0, reason: collision with root package name */
    private static final int[] f10034m0 = {R.attr.windowBackground};

    /* renamed from: n0, reason: collision with root package name */
    private static final boolean f10035n0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    private boolean f10036A;

    /* renamed from: B, reason: collision with root package name */
    ViewGroup f10037B;

    /* renamed from: C, reason: collision with root package name */
    private TextView f10038C;

    /* renamed from: D, reason: collision with root package name */
    private View f10039D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f10040E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f10041F;

    /* renamed from: G, reason: collision with root package name */
    boolean f10042G;

    /* renamed from: H, reason: collision with root package name */
    boolean f10043H;

    /* renamed from: I, reason: collision with root package name */
    boolean f10044I;

    /* renamed from: J, reason: collision with root package name */
    boolean f10045J;

    /* renamed from: K, reason: collision with root package name */
    boolean f10046K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f10047L;

    /* renamed from: M, reason: collision with root package name */
    private PanelFeatureState[] f10048M;

    /* renamed from: N, reason: collision with root package name */
    private PanelFeatureState f10049N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f10050O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f10051P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f10052Q;

    /* renamed from: R, reason: collision with root package name */
    boolean f10053R;

    /* renamed from: S, reason: collision with root package name */
    private Configuration f10054S;

    /* renamed from: T, reason: collision with root package name */
    private int f10055T;

    /* renamed from: U, reason: collision with root package name */
    private int f10056U;

    /* renamed from: V, reason: collision with root package name */
    private int f10057V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f10058W;

    /* renamed from: X, reason: collision with root package name */
    private p f10059X;

    /* renamed from: Y, reason: collision with root package name */
    private p f10060Y;

    /* renamed from: Z, reason: collision with root package name */
    boolean f10061Z;

    /* renamed from: a0, reason: collision with root package name */
    int f10062a0;

    /* renamed from: b0, reason: collision with root package name */
    private final Runnable f10063b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f10064c0;

    /* renamed from: d0, reason: collision with root package name */
    private Rect f10065d0;

    /* renamed from: e0, reason: collision with root package name */
    private Rect f10066e0;

    /* renamed from: f0, reason: collision with root package name */
    private t f10067f0;

    /* renamed from: g0, reason: collision with root package name */
    private v f10068g0;

    /* renamed from: i0, reason: collision with root package name */
    private OnBackInvokedDispatcher f10069i0;

    /* renamed from: j, reason: collision with root package name */
    final Object f10070j;

    /* renamed from: j0, reason: collision with root package name */
    private OnBackInvokedCallback f10071j0;

    /* renamed from: k, reason: collision with root package name */
    final Context f10072k;

    /* renamed from: l, reason: collision with root package name */
    Window f10073l;

    /* renamed from: m, reason: collision with root package name */
    private n f10074m;

    /* renamed from: n, reason: collision with root package name */
    final androidx.appcompat.app.e f10075n;

    /* renamed from: o, reason: collision with root package name */
    AbstractC1250a f10076o;

    /* renamed from: p, reason: collision with root package name */
    MenuInflater f10077p;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f10078q;

    /* renamed from: r, reason: collision with root package name */
    private InterfaceC1276z f10079r;

    /* renamed from: s, reason: collision with root package name */
    private h f10080s;

    /* renamed from: t, reason: collision with root package name */
    private s f10081t;

    /* renamed from: u, reason: collision with root package name */
    androidx.appcompat.view.b f10082u;

    /* renamed from: v, reason: collision with root package name */
    ActionBarContextView f10083v;

    /* renamed from: w, reason: collision with root package name */
    PopupWindow f10084w;

    /* renamed from: x, reason: collision with root package name */
    Runnable f10085x;

    /* renamed from: y, reason: collision with root package name */
    C1301k0 f10086y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f10087z;

    protected static final class PanelFeatureState {

        /* renamed from: a, reason: collision with root package name */
        int f10088a;

        /* renamed from: b, reason: collision with root package name */
        int f10089b;

        /* renamed from: c, reason: collision with root package name */
        int f10090c;

        /* renamed from: d, reason: collision with root package name */
        int f10091d;

        /* renamed from: e, reason: collision with root package name */
        int f10092e;

        /* renamed from: f, reason: collision with root package name */
        int f10093f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f10094g;

        /* renamed from: h, reason: collision with root package name */
        View f10095h;

        /* renamed from: i, reason: collision with root package name */
        View f10096i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f10097j;

        /* renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f10098k;

        /* renamed from: l, reason: collision with root package name */
        Context f10099l;

        /* renamed from: m, reason: collision with root package name */
        boolean f10100m;

        /* renamed from: n, reason: collision with root package name */
        boolean f10101n;

        /* renamed from: o, reason: collision with root package name */
        boolean f10102o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f10103p;

        /* renamed from: q, reason: collision with root package name */
        boolean f10104q = false;

        /* renamed from: r, reason: collision with root package name */
        boolean f10105r;

        /* renamed from: s, reason: collision with root package name */
        Bundle f10106s;

        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            int f10107b;

            /* renamed from: c, reason: collision with root package name */
            boolean f10108c;

            /* renamed from: d, reason: collision with root package name */
            Bundle f10109d;

            class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i4) {
                    return new SavedState[i4];
                }
            }

            SavedState() {
            }

            static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f10107b = parcel.readInt();
                boolean z4 = parcel.readInt() == 1;
                savedState.f10108c = z4;
                if (z4) {
                    savedState.f10109d = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i4) {
                parcel.writeInt(this.f10107b);
                parcel.writeInt(this.f10108c ? 1 : 0);
                if (this.f10108c) {
                    parcel.writeBundle(this.f10109d);
                }
            }
        }

        PanelFeatureState(int i4) {
            this.f10088a = i4;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f10097j == null) {
                return null;
            }
            if (this.f10098k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f10099l, e.g.f36331j);
                this.f10098k = cVar;
                cVar.f(aVar);
                this.f10097j.addMenuPresenter(this.f10098k);
            }
            return this.f10098k.j(this.f10094g);
        }

        public boolean b() {
            if (this.f10095h == null) {
                return false;
            }
            return this.f10096i != null || this.f10098k.i().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f10097j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.removeMenuPresenter(this.f10098k);
            }
            this.f10097j = eVar;
            if (eVar == null || (cVar = this.f10098k) == null) {
                return;
            }
            eVar.addMenuPresenter(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(AbstractC2405a.f36187a, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                newTheme.applyStyle(i4, true);
            }
            newTheme.resolveAttribute(AbstractC2405a.f36176C, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                newTheme.applyStyle(i5, true);
            } else {
                newTheme.applyStyle(e.i.f36357b, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f10099l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(e.j.f36591y0);
            this.f10089b = obtainStyledAttributes.getResourceId(e.j.f36366B0, 0);
            this.f10093f = obtainStyledAttributes.getResourceId(e.j.f36361A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f10062a0 & 1) != 0) {
                appCompatDelegateImpl.i0(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f10062a0 & Base64Utils.IO_BUFFER_SIZE) != 0) {
                appCompatDelegateImpl2.i0(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f10061Z = false;
            appCompatDelegateImpl3.f10062a0 = 0;
        }
    }

    class b implements J {
        b() {
        }

        @Override // androidx.core.view.J
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int e12 = AppCompatDelegateImpl.this.e1(windowInsetsCompat, null);
            if (systemWindowInsetTop != e12) {
                windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), e12, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
            }
            return AbstractC1281a0.a0(view, windowInsetsCompat);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.g0();
        }
    }

    class d implements Runnable {

        class a extends AbstractC1305m0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC1303l0
            public void b(View view) {
                AppCompatDelegateImpl.this.f10083v.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f10086y.g(null);
                AppCompatDelegateImpl.this.f10086y = null;
            }

            @Override // androidx.core.view.AbstractC1305m0, androidx.core.view.InterfaceC1303l0
            public void c(View view) {
                AppCompatDelegateImpl.this.f10083v.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f10084w.showAtLocation(appCompatDelegateImpl.f10083v, 55, 0, 0);
            AppCompatDelegateImpl.this.j0();
            if (!AppCompatDelegateImpl.this.U0()) {
                AppCompatDelegateImpl.this.f10083v.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f10083v.setVisibility(0);
            } else {
                AppCompatDelegateImpl.this.f10083v.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f10086y = AbstractC1281a0.e(appCompatDelegateImpl2.f10083v).b(1.0f);
                AppCompatDelegateImpl.this.f10086y.g(new a());
            }
        }
    }

    class e extends AbstractC1305m0 {
        e() {
        }

        @Override // androidx.core.view.InterfaceC1303l0
        public void b(View view) {
            AppCompatDelegateImpl.this.f10083v.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f10086y.g(null);
            AppCompatDelegateImpl.this.f10086y = null;
        }

        @Override // androidx.core.view.AbstractC1305m0, androidx.core.view.InterfaceC1303l0
        public void c(View view) {
            AppCompatDelegateImpl.this.f10083v.setVisibility(0);
            if (AppCompatDelegateImpl.this.f10083v.getParent() instanceof View) {
                AbstractC1281a0.l0((View) AppCompatDelegateImpl.this.f10083v.getParent());
            }
        }
    }

    private class f implements InterfaceC1251b {
        f() {
        }
    }

    interface g {
        boolean a(int i4);

        View onCreatePanelView(int i4);
    }

    private final class h implements j.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z4) {
            AppCompatDelegateImpl.this.Z(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback v02 = AppCompatDelegateImpl.this.v0();
            if (v02 == null) {
                return true;
            }
            v02.onMenuOpened(108, eVar);
            return true;
        }
    }

    class i implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f10118a;

        class a extends AbstractC1305m0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC1303l0
            public void b(View view) {
                AppCompatDelegateImpl.this.f10083v.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f10084w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f10083v.getParent() instanceof View) {
                    AbstractC1281a0.l0((View) AppCompatDelegateImpl.this.f10083v.getParent());
                }
                AppCompatDelegateImpl.this.f10083v.k();
                AppCompatDelegateImpl.this.f10086y.g(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f10086y = null;
                AbstractC1281a0.l0(appCompatDelegateImpl2.f10037B);
            }
        }

        public i(b.a aVar) {
            this.f10118a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f10118a.a(bVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f10084w != null) {
                appCompatDelegateImpl.f10073l.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f10085x);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f10083v != null) {
                appCompatDelegateImpl2.j0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f10086y = AbstractC1281a0.e(appCompatDelegateImpl3.f10083v).b(0.0f);
                AppCompatDelegateImpl.this.f10086y.g(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            androidx.appcompat.app.e eVar = appCompatDelegateImpl4.f10075n;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(appCompatDelegateImpl4.f10082u);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f10082u = null;
            AbstractC1281a0.l0(appCompatDelegateImpl5.f10037B);
            AppCompatDelegateImpl.this.c1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f10118a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            AbstractC1281a0.l0(AppCompatDelegateImpl.this.f10037B);
            return this.f10118a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f10118a.d(bVar, menuItem);
        }
    }

    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static androidx.core.os.i b(Configuration configuration) {
            return androidx.core.os.i.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(androidx.core.os.i iVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(iVar.g()));
        }

        static void d(Configuration configuration, androidx.core.os.i iVar) {
            configuration.setLocales(LocaleList.forLanguageTags(iVar.g()));
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            i4 = configuration.colorMode;
            int i12 = i4 & 3;
            i5 = configuration2.colorMode;
            if (i12 != (i5 & 3)) {
                i10 = configuration3.colorMode;
                i11 = configuration2.colorMode;
                configuration3.colorMode = i10 | (i11 & 3);
            }
            i6 = configuration.colorMode;
            int i13 = i6 & 12;
            i7 = configuration2.colorMode;
            if (i13 != (i7 & 12)) {
                i8 = configuration3.colorMode;
                i9 = configuration2.colorMode;
                configuration3.colorMode = i8 | (i9 & 12);
            }
        }
    }

    static class m {
        static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        static OnBackInvokedCallback b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.p
                public final void onBackInvoked() {
                    AppCompatDelegateImpl.this.D0();
                }
            };
            androidx.appcompat.app.l.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.l.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.k.a(obj2));
        }
    }

    class n extends androidx.appcompat.view.i {

        /* renamed from: b, reason: collision with root package name */
        private g f10121b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f10122c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f10123d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f10124e;

        n(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f10123d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f10123d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f10122c = true;
                callback.onContentChanged();
            } finally {
                this.f10122c = false;
            }
        }

        public void d(Window.Callback callback, int i4, Menu menu) {
            try {
                this.f10124e = true;
                callback.onPanelClosed(i4, menu);
            } finally {
                this.f10124e = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f10123d ? a().dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.G0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(g gVar) {
            this.f10121b = gVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(AppCompatDelegateImpl.this.f10072k, callback);
            androidx.appcompat.view.b O3 = AppCompatDelegateImpl.this.O(aVar);
            if (O3 != null) {
                return aVar.e(O3);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f10122c) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i4, Menu menu) {
            if (i4 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i4, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i4) {
            View onCreatePanelView;
            g gVar = this.f10121b;
            return (gVar == null || (onCreatePanelView = gVar.onCreatePanelView(i4)) == null) ? super.onCreatePanelView(i4) : onCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i4, Menu menu) {
            super.onMenuOpened(i4, menu);
            AppCompatDelegateImpl.this.J0(i4);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i4, Menu menu) {
            if (this.f10124e) {
                a().onPanelClosed(i4, menu);
            } else {
                super.onPanelClosed(i4, menu);
                AppCompatDelegateImpl.this.K0(i4);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i4, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i4 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.setOverrideVisibleItems(true);
            }
            g gVar = this.f10121b;
            boolean z4 = gVar != null && gVar.a(i4);
            if (!z4) {
                z4 = super.onPreparePanel(i4, view, menu);
            }
            if (eVar != null) {
                eVar.setOverrideVisibleItems(false);
            }
            return z4;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i4) {
            androidx.appcompat.view.menu.e eVar;
            PanelFeatureState t02 = AppCompatDelegateImpl.this.t0(0, true);
            if (t02 == null || (eVar = t02.f10097j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i4);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i4);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
            return (AppCompatDelegateImpl.this.B0() && i4 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i4);
        }
    }

    private class o extends p {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f10126c;

        o(Context context) {
            super();
            this.f10126c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public int c() {
            return j.a(this.f10126c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public void d() {
            AppCompatDelegateImpl.this.T();
        }
    }

    abstract class p {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f10128a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        p() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f10128a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f10072k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f10128a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b4 = b();
            if (b4 == null || b4.countActions() == 0) {
                return;
            }
            if (this.f10128a == null) {
                this.f10128a = new a();
            }
            AppCompatDelegateImpl.this.f10072k.registerReceiver(this.f10128a, b4);
        }
    }

    private class q extends p {

        /* renamed from: c, reason: collision with root package name */
        private final A f10131c;

        q(A a4) {
            super();
            this.f10131c = a4;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public int c() {
            return this.f10131c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public void d() {
            AppCompatDelegateImpl.this.T();
        }
    }

    private class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean b(int i4, int i5) {
            return i4 < -5 || i5 < -5 || i4 > getWidth() + 5 || i5 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.b0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i4) {
            setBackgroundDrawable(AbstractC2415a.b(getContext(), i4));
        }
    }

    private final class s implements j.a {
        s() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z4) {
            androidx.appcompat.view.menu.e rootMenu = eVar.getRootMenu();
            boolean z5 = rootMenu != eVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z5) {
                eVar = rootMenu;
            }
            PanelFeatureState m02 = appCompatDelegateImpl.m0(eVar);
            if (m02 != null) {
                if (!z5) {
                    AppCompatDelegateImpl.this.c0(m02, z4);
                } else {
                    AppCompatDelegateImpl.this.Y(m02.f10088a, m02, rootMenu);
                    AppCompatDelegateImpl.this.c0(m02, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback v02;
            if (eVar != eVar.getRootMenu()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f10042G || (v02 = appCompatDelegateImpl.v0()) == null || AppCompatDelegateImpl.this.f10053R) {
                return true;
            }
            v02.onMenuOpened(108, eVar);
            return true;
        }
    }

    AppCompatDelegateImpl(Activity activity, androidx.appcompat.app.e eVar) {
        this(activity, null, eVar, activity);
    }

    private void A0(int i4) {
        this.f10062a0 = (1 << i4) | this.f10062a0;
        if (this.f10061Z) {
            return;
        }
        AbstractC1281a0.g0(this.f10073l.getDecorView(), this.f10063b0);
        this.f10061Z = true;
    }

    private boolean F0(int i4, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState t02 = t0(i4, true);
        if (t02.f10102o) {
            return false;
        }
        return P0(t02, keyEvent);
    }

    private boolean I0(int i4, KeyEvent keyEvent) {
        boolean z4;
        InterfaceC1276z interfaceC1276z;
        if (this.f10082u != null) {
            return false;
        }
        boolean z5 = true;
        PanelFeatureState t02 = t0(i4, true);
        if (i4 != 0 || (interfaceC1276z = this.f10079r) == null || !interfaceC1276z.d() || ViewConfiguration.get(this.f10072k).hasPermanentMenuKey()) {
            boolean z6 = t02.f10102o;
            if (z6 || t02.f10101n) {
                c0(t02, true);
                z5 = z6;
            } else {
                if (t02.f10100m) {
                    if (t02.f10105r) {
                        t02.f10100m = false;
                        z4 = P0(t02, keyEvent);
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        M0(t02, keyEvent);
                    }
                }
                z5 = false;
            }
        } else if (this.f10079r.b()) {
            z5 = this.f10079r.f();
        } else {
            if (!this.f10053R && P0(t02, keyEvent)) {
                z5 = this.f10079r.g();
            }
            z5 = false;
        }
        if (z5) {
            AudioManager audioManager = (AudioManager) this.f10072k.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return z5;
            }
            Log.w("AppCompatDelegate", "Couldn't get audio manager");
        }
        return z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void M0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i4;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.f10102o || this.f10053R) {
            return;
        }
        if (panelFeatureState.f10088a == 0 && (this.f10072k.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback v02 = v0();
        if (v02 != null && !v02.onMenuOpened(panelFeatureState.f10088a, panelFeatureState.f10097j)) {
            c0(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f10072k.getSystemService("window");
        if (windowManager == null || !P0(panelFeatureState, keyEvent)) {
            return;
        }
        ViewGroup viewGroup = panelFeatureState.f10094g;
        if (viewGroup == null || panelFeatureState.f10104q) {
            if (viewGroup == null) {
                if (!y0(panelFeatureState) || panelFeatureState.f10094g == null) {
                    return;
                }
            } else if (panelFeatureState.f10104q && viewGroup.getChildCount() > 0) {
                panelFeatureState.f10094g.removeAllViews();
            }
            if (!x0(panelFeatureState) || !panelFeatureState.b()) {
                panelFeatureState.f10104q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = panelFeatureState.f10095h.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
            }
            panelFeatureState.f10094g.setBackgroundResource(panelFeatureState.f10089b);
            ViewParent parent = panelFeatureState.f10095h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(panelFeatureState.f10095h);
            }
            panelFeatureState.f10094g.addView(panelFeatureState.f10095h, layoutParams2);
            if (!panelFeatureState.f10095h.hasFocus()) {
                panelFeatureState.f10095h.requestFocus();
            }
        } else {
            View view = panelFeatureState.f10096i;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i4 = -1;
                panelFeatureState.f10101n = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i4, -2, panelFeatureState.f10091d, panelFeatureState.f10092e, 1002, 8519680, -3);
                layoutParams3.gravity = panelFeatureState.f10090c;
                layoutParams3.windowAnimations = panelFeatureState.f10093f;
                windowManager.addView(panelFeatureState.f10094g, layoutParams3);
                panelFeatureState.f10102o = true;
                if (panelFeatureState.f10088a != 0) {
                    c1();
                    return;
                }
                return;
            }
        }
        i4 = -2;
        panelFeatureState.f10101n = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i4, -2, panelFeatureState.f10091d, panelFeatureState.f10092e, 1002, 8519680, -3);
        layoutParams32.gravity = panelFeatureState.f10090c;
        layoutParams32.windowAnimations = panelFeatureState.f10093f;
        windowManager.addView(panelFeatureState.f10094g, layoutParams32);
        panelFeatureState.f10102o = true;
        if (panelFeatureState.f10088a != 0) {
        }
    }

    private boolean O0(PanelFeatureState panelFeatureState, int i4, KeyEvent keyEvent, int i5) {
        androidx.appcompat.view.menu.e eVar;
        boolean z4 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f10100m || P0(panelFeatureState, keyEvent)) && (eVar = panelFeatureState.f10097j) != null) {
            z4 = eVar.performShortcut(i4, keyEvent, i5);
        }
        if (z4 && (i5 & 1) == 0 && this.f10079r == null) {
            c0(panelFeatureState, true);
        }
        return z4;
    }

    private boolean P0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        InterfaceC1276z interfaceC1276z;
        InterfaceC1276z interfaceC1276z2;
        InterfaceC1276z interfaceC1276z3;
        if (this.f10053R) {
            return false;
        }
        if (panelFeatureState.f10100m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f10049N;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            c0(panelFeatureState2, false);
        }
        Window.Callback v02 = v0();
        if (v02 != null) {
            panelFeatureState.f10096i = v02.onCreatePanelView(panelFeatureState.f10088a);
        }
        int i4 = panelFeatureState.f10088a;
        boolean z4 = i4 == 0 || i4 == 108;
        if (z4 && (interfaceC1276z3 = this.f10079r) != null) {
            interfaceC1276z3.c();
        }
        if (panelFeatureState.f10096i == null && (!z4 || !(N0() instanceof y))) {
            androidx.appcompat.view.menu.e eVar = panelFeatureState.f10097j;
            if (eVar == null || panelFeatureState.f10105r) {
                if (eVar == null && (!z0(panelFeatureState) || panelFeatureState.f10097j == null)) {
                    return false;
                }
                if (z4 && this.f10079r != null) {
                    if (this.f10080s == null) {
                        this.f10080s = new h();
                    }
                    this.f10079r.a(panelFeatureState.f10097j, this.f10080s);
                }
                panelFeatureState.f10097j.stopDispatchingItemsChanged();
                if (!v02.onCreatePanelMenu(panelFeatureState.f10088a, panelFeatureState.f10097j)) {
                    panelFeatureState.c(null);
                    if (z4 && (interfaceC1276z = this.f10079r) != null) {
                        interfaceC1276z.a(null, this.f10080s);
                    }
                    return false;
                }
                panelFeatureState.f10105r = false;
            }
            panelFeatureState.f10097j.stopDispatchingItemsChanged();
            Bundle bundle = panelFeatureState.f10106s;
            if (bundle != null) {
                panelFeatureState.f10097j.restoreActionViewStates(bundle);
                panelFeatureState.f10106s = null;
            }
            if (!v02.onPreparePanel(0, panelFeatureState.f10096i, panelFeatureState.f10097j)) {
                if (z4 && (interfaceC1276z2 = this.f10079r) != null) {
                    interfaceC1276z2.a(null, this.f10080s);
                }
                panelFeatureState.f10097j.startDispatchingItemsChanged();
                return false;
            }
            boolean z5 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f10103p = z5;
            panelFeatureState.f10097j.setQwertyMode(z5);
            panelFeatureState.f10097j.startDispatchingItemsChanged();
        }
        panelFeatureState.f10100m = true;
        panelFeatureState.f10101n = false;
        this.f10049N = panelFeatureState;
        return true;
    }

    private void Q0(boolean z4) {
        InterfaceC1276z interfaceC1276z = this.f10079r;
        if (interfaceC1276z == null || !interfaceC1276z.d() || (ViewConfiguration.get(this.f10072k).hasPermanentMenuKey() && !this.f10079r.e())) {
            PanelFeatureState t02 = t0(0, true);
            t02.f10104q = true;
            c0(t02, false);
            M0(t02, null);
            return;
        }
        Window.Callback v02 = v0();
        if (this.f10079r.b() && z4) {
            this.f10079r.f();
            if (this.f10053R) {
                return;
            }
            v02.onPanelClosed(108, t0(0, true).f10097j);
            return;
        }
        if (v02 == null || this.f10053R) {
            return;
        }
        if (this.f10061Z && (this.f10062a0 & 1) != 0) {
            this.f10073l.getDecorView().removeCallbacks(this.f10063b0);
            this.f10063b0.run();
        }
        PanelFeatureState t03 = t0(0, true);
        androidx.appcompat.view.menu.e eVar = t03.f10097j;
        if (eVar == null || t03.f10105r || !v02.onPreparePanel(0, t03.f10096i, eVar)) {
            return;
        }
        v02.onMenuOpened(108, t03.f10097j);
        this.f10079r.g();
    }

    private boolean R(boolean z4) {
        return S(z4, true);
    }

    private int R0(int i4) {
        if (i4 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i4 != 9) {
            return i4;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return InterfaceC1490j3.d.b.f16815g;
    }

    private boolean S(boolean z4, boolean z5) {
        if (this.f10053R) {
            return false;
        }
        int X3 = X();
        int C02 = C0(this.f10072k, X3);
        androidx.core.os.i W3 = Build.VERSION.SDK_INT < 33 ? W(this.f10072k) : null;
        if (!z5 && W3 != null) {
            W3 = s0(this.f10072k.getResources().getConfiguration());
        }
        boolean b12 = b1(C02, W3, z4);
        if (X3 == 0) {
            r0(this.f10072k).e();
        } else {
            p pVar = this.f10059X;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (X3 == 3) {
            q0(this.f10072k).e();
            return b12;
        }
        p pVar2 = this.f10060Y;
        if (pVar2 != null) {
            pVar2.a();
        }
        return b12;
    }

    private void U() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f10037B.findViewById(R.id.content);
        View decorView = this.f10073l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f10072k.obtainStyledAttributes(e.j.f36591y0);
        obtainStyledAttributes.getValue(e.j.f36407K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(e.j.f36411L0, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(e.j.f36399I0)) {
            obtainStyledAttributes.getValue(e.j.f36399I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(e.j.f36403J0)) {
            obtainStyledAttributes.getValue(e.j.f36403J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(e.j.f36391G0)) {
            obtainStyledAttributes.getValue(e.j.f36391G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(e.j.f36395H0)) {
            obtainStyledAttributes.getValue(e.j.f36395H0, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void V(Window window) {
        if (this.f10073l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.f10074m = nVar;
        window.setCallback(nVar);
        Z u4 = Z.u(this.f10072k, null, f10034m0);
        Drawable h4 = u4.h(0);
        if (h4 != null) {
            window.setBackgroundDrawable(h4);
        }
        u4.x();
        this.f10073l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f10069i0 != null) {
            return;
        }
        K(null);
    }

    private boolean V0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f10073l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int X() {
        int i4 = this.f10055T;
        return i4 != -100 ? i4 : androidx.appcompat.app.g.m();
    }

    private void Y0() {
        if (this.f10036A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private androidx.appcompat.app.d Z0() {
        for (Context context = this.f10072k; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.d) {
                return (androidx.appcompat.app.d) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void a0() {
        p pVar = this.f10059X;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.f10060Y;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a1(Configuration configuration) {
        Activity activity = (Activity) this.f10070j;
        if (activity instanceof InterfaceC1354u) {
            if (((InterfaceC1354u) activity).getLifecycle().getCurrentState().d(AbstractC1346l.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f10052Q || this.f10053R) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean b1(int i4, androidx.core.os.i iVar, boolean z4) {
        boolean z5;
        Configuration d02 = d0(this.f10072k, i4, iVar, null, false);
        int p02 = p0(this.f10072k);
        Configuration configuration = this.f10054S;
        if (configuration == null) {
            configuration = this.f10072k.getResources().getConfiguration();
        }
        int i5 = configuration.uiMode & 48;
        int i6 = d02.uiMode & 48;
        androidx.core.os.i s02 = s0(configuration);
        androidx.core.os.i s03 = iVar == null ? null : s0(d02);
        int i7 = i5 != i6 ? UserVerificationMethods.USER_VERIFY_NONE : 0;
        if (s03 != null && !s02.equals(s03)) {
            i7 |= 8196;
        }
        boolean z6 = true;
        if (((~p02) & i7) != 0 && z4 && this.f10051P && (f10035n0 || this.f10052Q)) {
            Object obj = this.f10070j;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                if (Build.VERSION.SDK_INT >= 31 && (i7 & 8192) != 0) {
                    ((Activity) this.f10070j).getWindow().getDecorView().setLayoutDirection(d02.getLayoutDirection());
                }
                AbstractC1278b.v((Activity) this.f10070j);
                z5 = true;
                if (!z5 || i7 == 0) {
                    z6 = z5;
                } else {
                    d1(i6, s03, (i7 & p02) == i7, null);
                }
                if (z6) {
                    Object obj2 = this.f10070j;
                    if (obj2 instanceof androidx.appcompat.app.d) {
                        if ((i7 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                            ((androidx.appcompat.app.d) obj2).onNightModeChanged(i4);
                        }
                        if ((i7 & 4) != 0) {
                            ((androidx.appcompat.app.d) this.f10070j).onLocalesChanged(iVar);
                        }
                    }
                }
                if (s03 != null) {
                    T0(s0(this.f10072k.getResources().getConfiguration()));
                }
                return z6;
            }
        }
        z5 = false;
        if (z5) {
        }
        z6 = z5;
        if (z6) {
        }
        if (s03 != null) {
        }
        return z6;
    }

    private Configuration d0(Context context, int i4, androidx.core.os.i iVar, Configuration configuration, boolean z4) {
        int i5 = i4 != 1 ? i4 != 2 ? z4 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i5 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            S0(configuration2, iVar);
        }
        return configuration2;
    }

    private void d1(int i4, androidx.core.os.i iVar, boolean z4, Configuration configuration) {
        Resources resources = this.f10072k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i4 | (resources.getConfiguration().uiMode & (-49));
        if (iVar != null) {
            S0(configuration2, iVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            x.a(resources);
        }
        int i5 = this.f10056U;
        if (i5 != 0) {
            this.f10072k.setTheme(i5);
            this.f10072k.getTheme().applyStyle(this.f10056U, true);
        }
        if (z4 && (this.f10070j instanceof Activity)) {
            a1(configuration2);
        }
    }

    private ViewGroup e0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f10072k.obtainStyledAttributes(e.j.f36591y0);
        if (!obtainStyledAttributes.hasValue(e.j.f36376D0)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(e.j.f36415M0, false)) {
            G(1);
        } else if (obtainStyledAttributes.getBoolean(e.j.f36376D0, false)) {
            G(108);
        }
        if (obtainStyledAttributes.getBoolean(e.j.f36381E0, false)) {
            G(InterfaceC1490j3.d.b.f16815g);
        }
        if (obtainStyledAttributes.getBoolean(e.j.f36386F0, false)) {
            G(10);
        }
        this.f10045J = obtainStyledAttributes.getBoolean(e.j.f36596z0, false);
        obtainStyledAttributes.recycle();
        l0();
        this.f10073l.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f10072k);
        if (this.f10046K) {
            viewGroup = this.f10044I ? (ViewGroup) from.inflate(e.g.f36336o, (ViewGroup) null) : (ViewGroup) from.inflate(e.g.f36335n, (ViewGroup) null);
        } else if (this.f10045J) {
            viewGroup = (ViewGroup) from.inflate(e.g.f36327f, (ViewGroup) null);
            this.f10043H = false;
            this.f10042G = false;
        } else if (this.f10042G) {
            TypedValue typedValue = new TypedValue();
            this.f10072k.getTheme().resolveAttribute(AbstractC2405a.f36190d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f10072k, typedValue.resourceId) : this.f10072k).inflate(e.g.f36337p, (ViewGroup) null);
            InterfaceC1276z interfaceC1276z = (InterfaceC1276z) viewGroup.findViewById(e.f.f36311p);
            this.f10079r = interfaceC1276z;
            interfaceC1276z.setWindowCallback(v0());
            if (this.f10043H) {
                this.f10079r.h(InterfaceC1490j3.d.b.f16815g);
            }
            if (this.f10040E) {
                this.f10079r.h(2);
            }
            if (this.f10041F) {
                this.f10079r.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f10042G + ", windowActionBarOverlay: " + this.f10043H + ", android:windowIsFloating: " + this.f10045J + ", windowActionModeOverlay: " + this.f10044I + ", windowNoTitle: " + this.f10046K + " }");
        }
        AbstractC1281a0.E0(viewGroup, new b());
        if (this.f10079r == null) {
            this.f10038C = (TextView) viewGroup.findViewById(e.f.f36292M);
        }
        k0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(e.f.f36297b);
        ViewGroup viewGroup2 = (ViewGroup) this.f10073l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f10073l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void f1(View view) {
        view.setBackgroundColor((AbstractC1281a0.M(view) & 8192) != 0 ? androidx.core.content.a.d(this.f10072k, AbstractC2407c.f36215b) : androidx.core.content.a.d(this.f10072k, AbstractC2407c.f36214a));
    }

    private void k0() {
        if (this.f10036A) {
            return;
        }
        this.f10037B = e0();
        CharSequence u02 = u0();
        if (!TextUtils.isEmpty(u02)) {
            InterfaceC1276z interfaceC1276z = this.f10079r;
            if (interfaceC1276z != null) {
                interfaceC1276z.setWindowTitle(u02);
            } else if (N0() != null) {
                N0().t(u02);
            } else {
                TextView textView = this.f10038C;
                if (textView != null) {
                    textView.setText(u02);
                }
            }
        }
        U();
        L0(this.f10037B);
        this.f10036A = true;
        PanelFeatureState t02 = t0(0, false);
        if (this.f10053R) {
            return;
        }
        if (t02 == null || t02.f10097j == null) {
            A0(108);
        }
    }

    private void l0() {
        if (this.f10073l == null) {
            Object obj = this.f10070j;
            if (obj instanceof Activity) {
                V(((Activity) obj).getWindow());
            }
        }
        if (this.f10073l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration n0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f4 = configuration.fontScale;
            float f5 = configuration2.fontScale;
            if (f4 != f5) {
                configuration3.fontScale = f5;
            }
            int i4 = configuration.mcc;
            int i5 = configuration2.mcc;
            if (i4 != i5) {
                configuration3.mcc = i5;
            }
            int i6 = configuration.mnc;
            int i7 = configuration2.mnc;
            if (i6 != i7) {
                configuration3.mnc = i7;
            }
            int i8 = Build.VERSION.SDK_INT;
            k.a(configuration, configuration2, configuration3);
            int i9 = configuration.touchscreen;
            int i10 = configuration2.touchscreen;
            if (i9 != i10) {
                configuration3.touchscreen = i10;
            }
            int i11 = configuration.keyboard;
            int i12 = configuration2.keyboard;
            if (i11 != i12) {
                configuration3.keyboard = i12;
            }
            int i13 = configuration.keyboardHidden;
            int i14 = configuration2.keyboardHidden;
            if (i13 != i14) {
                configuration3.keyboardHidden = i14;
            }
            int i15 = configuration.navigation;
            int i16 = configuration2.navigation;
            if (i15 != i16) {
                configuration3.navigation = i16;
            }
            int i17 = configuration.navigationHidden;
            int i18 = configuration2.navigationHidden;
            if (i17 != i18) {
                configuration3.navigationHidden = i18;
            }
            int i19 = configuration.orientation;
            int i20 = configuration2.orientation;
            if (i19 != i20) {
                configuration3.orientation = i20;
            }
            int i21 = configuration.screenLayout & 15;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 15)) {
                configuration3.screenLayout |= i22 & 15;
            }
            int i23 = configuration.screenLayout & 192;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 192)) {
                configuration3.screenLayout |= i24 & 192;
            }
            int i25 = configuration.screenLayout & 48;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 48)) {
                configuration3.screenLayout |= i26 & 48;
            }
            int i27 = configuration.screenLayout & 768;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 768)) {
                configuration3.screenLayout |= i28 & 768;
            }
            if (i8 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i29 = configuration.uiMode & 15;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 15)) {
                configuration3.uiMode |= i30 & 15;
            }
            int i31 = configuration.uiMode & 48;
            int i32 = configuration2.uiMode;
            if (i31 != (i32 & 48)) {
                configuration3.uiMode |= i32 & 48;
            }
            int i33 = configuration.screenWidthDp;
            int i34 = configuration2.screenWidthDp;
            if (i33 != i34) {
                configuration3.screenWidthDp = i34;
            }
            int i35 = configuration.screenHeightDp;
            int i36 = configuration2.screenHeightDp;
            if (i35 != i36) {
                configuration3.screenHeightDp = i36;
            }
            int i37 = configuration.smallestScreenWidthDp;
            int i38 = configuration2.smallestScreenWidthDp;
            if (i37 != i38) {
                configuration3.smallestScreenWidthDp = i38;
            }
            int i39 = configuration.densityDpi;
            int i40 = configuration2.densityDpi;
            if (i39 != i40) {
                configuration3.densityDpi = i40;
            }
        }
        return configuration3;
    }

    private int p0(Context context) {
        if (!this.f10058W && (this.f10070j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f10070j.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f10057V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e4) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e4);
                this.f10057V = 0;
            }
        }
        this.f10058W = true;
        return this.f10057V;
    }

    private p q0(Context context) {
        if (this.f10060Y == null) {
            this.f10060Y = new o(context);
        }
        return this.f10060Y;
    }

    private p r0(Context context) {
        if (this.f10059X == null) {
            this.f10059X = new q(A.a(context));
        }
        return this.f10059X;
    }

    private void w0() {
        k0();
        if (this.f10042G && this.f10076o == null) {
            Object obj = this.f10070j;
            if (obj instanceof Activity) {
                this.f10076o = new B((Activity) this.f10070j, this.f10043H);
            } else if (obj instanceof Dialog) {
                this.f10076o = new B((Dialog) this.f10070j);
            }
            AbstractC1250a abstractC1250a = this.f10076o;
            if (abstractC1250a != null) {
                abstractC1250a.r(this.f10064c0);
            }
        }
    }

    private boolean x0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f10096i;
        if (view != null) {
            panelFeatureState.f10095h = view;
            return true;
        }
        if (panelFeatureState.f10097j == null) {
            return false;
        }
        if (this.f10081t == null) {
            this.f10081t = new s();
        }
        View view2 = (View) panelFeatureState.a(this.f10081t);
        panelFeatureState.f10095h = view2;
        return view2 != null;
    }

    private boolean y0(PanelFeatureState panelFeatureState) {
        panelFeatureState.d(o0());
        panelFeatureState.f10094g = new r(panelFeatureState.f10099l);
        panelFeatureState.f10090c = 81;
        return true;
    }

    private boolean z0(PanelFeatureState panelFeatureState) {
        Resources.Theme theme;
        Context context = this.f10072k;
        int i4 = panelFeatureState.f10088a;
        if ((i4 == 0 || i4 == 108) && this.f10079r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(AbstractC2405a.f36190d, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(AbstractC2405a.f36191e, typedValue, true);
            } else {
                theme2.resolveAttribute(AbstractC2405a.f36191e, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.setCallback(this);
        panelFeatureState.c(eVar);
        return true;
    }

    @Override // androidx.appcompat.app.g
    public void A() {
        AbstractC1250a s4 = s();
        if (s4 != null) {
            s4.s(true);
        }
    }

    @Override // androidx.appcompat.app.g
    public void B(Bundle bundle) {
    }

    public boolean B0() {
        return this.f10087z;
    }

    @Override // androidx.appcompat.app.g
    public void C() {
        S(true, false);
    }

    int C0(Context context, int i4) {
        if (i4 == -100) {
            return -1;
        }
        if (i4 != -1) {
            if (i4 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return r0(context).c();
            }
            if (i4 != 1 && i4 != 2) {
                if (i4 == 3) {
                    return q0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i4;
    }

    @Override // androidx.appcompat.app.g
    public void D() {
        AbstractC1250a s4 = s();
        if (s4 != null) {
            s4.s(false);
        }
    }

    boolean D0() {
        boolean z4 = this.f10050O;
        this.f10050O = false;
        PanelFeatureState t02 = t0(0, false);
        if (t02 != null && t02.f10102o) {
            if (!z4) {
                c0(t02, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f10082u;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        AbstractC1250a s4 = s();
        return s4 != null && s4.h();
    }

    boolean E0(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            this.f10050O = (keyEvent.getFlags() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
        } else if (i4 == 82) {
            F0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public boolean G(int i4) {
        int R02 = R0(i4);
        if (this.f10046K && R02 == 108) {
            return false;
        }
        if (this.f10042G && R02 == 1) {
            this.f10042G = false;
        }
        if (R02 == 1) {
            Y0();
            this.f10046K = true;
            return true;
        }
        if (R02 == 2) {
            Y0();
            this.f10040E = true;
            return true;
        }
        if (R02 == 5) {
            Y0();
            this.f10041F = true;
            return true;
        }
        if (R02 == 10) {
            Y0();
            this.f10044I = true;
            return true;
        }
        if (R02 == 108) {
            Y0();
            this.f10042G = true;
            return true;
        }
        if (R02 != 109) {
            return this.f10073l.requestFeature(R02);
        }
        Y0();
        this.f10043H = true;
        return true;
    }

    boolean G0(int i4, KeyEvent keyEvent) {
        AbstractC1250a s4 = s();
        if (s4 != null && s4.o(i4, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f10049N;
        if (panelFeatureState != null && O0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.f10049N;
            if (panelFeatureState2 != null) {
                panelFeatureState2.f10101n = true;
            }
            return true;
        }
        if (this.f10049N == null) {
            PanelFeatureState t02 = t0(0, true);
            P0(t02, keyEvent);
            boolean O02 = O0(t02, keyEvent.getKeyCode(), keyEvent, 1);
            t02.f10100m = false;
            if (O02) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public void H(int i4) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f10037B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f10072k).inflate(i4, viewGroup);
        this.f10074m.c(this.f10073l.getCallback());
    }

    boolean H0(int i4, KeyEvent keyEvent) {
        if (i4 != 4) {
            if (i4 == 82) {
                I0(0, keyEvent);
                return true;
            }
        } else if (D0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public void I(View view) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f10037B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f10074m.c(this.f10073l.getCallback());
    }

    @Override // androidx.appcompat.app.g
    public void J(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f10037B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f10074m.c(this.f10073l.getCallback());
    }

    void J0(int i4) {
        AbstractC1250a s4;
        if (i4 != 108 || (s4 = s()) == null) {
            return;
        }
        s4.i(true);
    }

    @Override // androidx.appcompat.app.g
    public void K(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.K(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f10069i0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f10071j0) != null) {
            m.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f10071j0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f10070j;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f10069i0 = m.a((Activity) this.f10070j);
                c1();
            }
        }
        this.f10069i0 = onBackInvokedDispatcher;
        c1();
    }

    void K0(int i4) {
        if (i4 == 108) {
            AbstractC1250a s4 = s();
            if (s4 != null) {
                s4.i(false);
                return;
            }
            return;
        }
        if (i4 == 0) {
            PanelFeatureState t02 = t0(i4, true);
            if (t02.f10102o) {
                c0(t02, false);
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public void L(Toolbar toolbar) {
        if (this.f10070j instanceof Activity) {
            AbstractC1250a s4 = s();
            if (s4 instanceof B) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f10077p = null;
            if (s4 != null) {
                s4.n();
            }
            this.f10076o = null;
            if (toolbar != null) {
                y yVar = new y(toolbar, u0(), this.f10074m);
                this.f10076o = yVar;
                this.f10074m.e(yVar.f10212c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f10074m.e(null);
            }
            u();
        }
    }

    void L0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.g
    public void M(int i4) {
        this.f10056U = i4;
    }

    @Override // androidx.appcompat.app.g
    public final void N(CharSequence charSequence) {
        this.f10078q = charSequence;
        InterfaceC1276z interfaceC1276z = this.f10079r;
        if (interfaceC1276z != null) {
            interfaceC1276z.setWindowTitle(charSequence);
            return;
        }
        if (N0() != null) {
            N0().t(charSequence);
            return;
        }
        TextView textView = this.f10038C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    final AbstractC1250a N0() {
        return this.f10076o;
    }

    @Override // androidx.appcompat.app.g
    public androidx.appcompat.view.b O(b.a aVar) {
        androidx.appcompat.app.e eVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f10082u;
        if (bVar != null) {
            bVar.c();
        }
        i iVar = new i(aVar);
        AbstractC1250a s4 = s();
        if (s4 != null) {
            androidx.appcompat.view.b u4 = s4.u(iVar);
            this.f10082u = u4;
            if (u4 != null && (eVar = this.f10075n) != null) {
                eVar.onSupportActionModeStarted(u4);
            }
        }
        if (this.f10082u == null) {
            this.f10082u = X0(iVar);
        }
        c1();
        return this.f10082u;
    }

    void S0(Configuration configuration, androidx.core.os.i iVar) {
        k.d(configuration, iVar);
    }

    public boolean T() {
        return R(true);
    }

    void T0(androidx.core.os.i iVar) {
        k.c(iVar);
    }

    final boolean U0() {
        ViewGroup viewGroup;
        return this.f10036A && (viewGroup = this.f10037B) != null && viewGroup.isLaidOut();
    }

    androidx.core.os.i W(Context context) {
        androidx.core.os.i r4;
        if (Build.VERSION.SDK_INT >= 33 || (r4 = androidx.appcompat.app.g.r()) == null) {
            return null;
        }
        androidx.core.os.i s02 = s0(context.getApplicationContext().getResources().getConfiguration());
        androidx.core.os.i b4 = w.b(r4, s02);
        return b4.e() ? s02 : b4;
    }

    boolean W0() {
        if (this.f10069i0 == null) {
            return false;
        }
        PanelFeatureState t02 = t0(0, false);
        return (t02 != null && t02.f10102o) || this.f10082u != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    androidx.appcompat.view.b X0(b.a aVar) {
        androidx.appcompat.view.b bVar;
        Context context;
        androidx.appcompat.view.b bVar2;
        androidx.appcompat.app.e eVar;
        j0();
        androidx.appcompat.view.b bVar3 = this.f10082u;
        if (bVar3 != null) {
            bVar3.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        androidx.appcompat.app.e eVar2 = this.f10075n;
        if (eVar2 != null && !this.f10053R) {
            try {
                bVar = eVar2.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
            }
            if (bVar == null) {
                this.f10082u = bVar;
            } else {
                if (this.f10083v == null) {
                    if (this.f10045J) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = this.f10072k.getTheme();
                        theme.resolveAttribute(AbstractC2405a.f36190d, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = this.f10072k.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context = new androidx.appcompat.view.d(this.f10072k, 0);
                            context.getTheme().setTo(newTheme);
                        } else {
                            context = this.f10072k;
                        }
                        this.f10083v = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, AbstractC2405a.f36192f);
                        this.f10084w = popupWindow;
                        androidx.core.widget.i.b(popupWindow, 2);
                        this.f10084w.setContentView(this.f10083v);
                        this.f10084w.setWidth(-1);
                        context.getTheme().resolveAttribute(AbstractC2405a.f36188b, typedValue, true);
                        this.f10083v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f10084w.setHeight(-2);
                        this.f10085x = new d();
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.f10037B.findViewById(e.f.f36303h);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(o0()));
                            this.f10083v = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.f10083v != null) {
                    j0();
                    this.f10083v.k();
                    androidx.appcompat.view.e eVar3 = new androidx.appcompat.view.e(this.f10083v.getContext(), this.f10083v, aVar, this.f10084w == null);
                    if (aVar.b(eVar3, eVar3.e())) {
                        eVar3.k();
                        this.f10083v.h(eVar3);
                        this.f10082u = eVar3;
                        if (U0()) {
                            this.f10083v.setAlpha(0.0f);
                            C1301k0 b4 = AbstractC1281a0.e(this.f10083v).b(1.0f);
                            this.f10086y = b4;
                            b4.g(new e());
                        } else {
                            this.f10083v.setAlpha(1.0f);
                            this.f10083v.setVisibility(0);
                            if (this.f10083v.getParent() instanceof View) {
                                AbstractC1281a0.l0((View) this.f10083v.getParent());
                            }
                        }
                        if (this.f10084w != null) {
                            this.f10073l.getDecorView().post(this.f10085x);
                        }
                    } else {
                        this.f10082u = null;
                    }
                }
            }
            bVar2 = this.f10082u;
            if (bVar2 != null && (eVar = this.f10075n) != null) {
                eVar.onSupportActionModeStarted(bVar2);
            }
            c1();
            return this.f10082u;
        }
        bVar = null;
        if (bVar == null) {
        }
        bVar2 = this.f10082u;
        if (bVar2 != null) {
            eVar.onSupportActionModeStarted(bVar2);
        }
        c1();
        return this.f10082u;
    }

    void Y(int i4, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i4 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f10048M;
                if (i4 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i4];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f10097j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f10102o) && !this.f10053R) {
            this.f10074m.d(this.f10073l.getCallback(), i4, menu);
        }
    }

    void Z(androidx.appcompat.view.menu.e eVar) {
        if (this.f10047L) {
            return;
        }
        this.f10047L = true;
        this.f10079r.i();
        Window.Callback v02 = v0();
        if (v02 != null && !this.f10053R) {
            v02.onPanelClosed(108, eVar);
        }
        this.f10047L = false;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        PanelFeatureState m02;
        Window.Callback v02 = v0();
        if (v02 == null || this.f10053R || (m02 = m0(eVar.getRootMenu())) == null) {
            return false;
        }
        return v02.onMenuItemSelected(m02.f10088a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        Q0(true);
    }

    void b0(int i4) {
        c0(t0(i4, true), true);
    }

    void c0(PanelFeatureState panelFeatureState, boolean z4) {
        ViewGroup viewGroup;
        InterfaceC1276z interfaceC1276z;
        if (z4 && panelFeatureState.f10088a == 0 && (interfaceC1276z = this.f10079r) != null && interfaceC1276z.b()) {
            Z(panelFeatureState.f10097j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f10072k.getSystemService("window");
        if (windowManager != null && panelFeatureState.f10102o && (viewGroup = panelFeatureState.f10094g) != null) {
            windowManager.removeView(viewGroup);
            if (z4) {
                Y(panelFeatureState.f10088a, panelFeatureState, null);
            }
        }
        panelFeatureState.f10100m = false;
        panelFeatureState.f10101n = false;
        panelFeatureState.f10102o = false;
        panelFeatureState.f10095h = null;
        panelFeatureState.f10104q = true;
        if (this.f10049N == panelFeatureState) {
            this.f10049N = null;
        }
        if (panelFeatureState.f10088a == 0) {
            c1();
        }
    }

    void c1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean W02 = W0();
            if (W02 && this.f10071j0 == null) {
                this.f10071j0 = m.b(this.f10069i0, this);
            } else {
                if (W02 || (onBackInvokedCallback = this.f10071j0) == null) {
                    return;
                }
                m.c(this.f10069i0, onBackInvokedCallback);
                this.f10071j0 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ((ViewGroup) this.f10037B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f10074m.c(this.f10073l.getCallback());
    }

    final int e1(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        boolean z4;
        boolean z5;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f10083v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z4 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10083v.getLayoutParams();
            if (this.f10083v.isShown()) {
                if (this.f10065d0 == null) {
                    this.f10065d0 = new Rect();
                    this.f10066e0 = new Rect();
                }
                Rect rect2 = this.f10065d0;
                Rect rect3 = this.f10066e0;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                }
                k0.a(this.f10037B, rect2, rect3);
                int i4 = rect2.top;
                int i5 = rect2.left;
                int i6 = rect2.right;
                WindowInsetsCompat I3 = AbstractC1281a0.I(this.f10037B);
                int systemWindowInsetLeft = I3 == null ? 0 : I3.getSystemWindowInsetLeft();
                int systemWindowInsetRight = I3 == null ? 0 : I3.getSystemWindowInsetRight();
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z5 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z5 = true;
                }
                if (i4 <= 0 || this.f10039D != null) {
                    View view = this.f10039D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i8 = marginLayoutParams.topMargin;
                        if (i7 != i8 || marginLayoutParams2.leftMargin != systemWindowInsetLeft || marginLayoutParams2.rightMargin != systemWindowInsetRight) {
                            marginLayoutParams2.height = i8;
                            marginLayoutParams2.leftMargin = systemWindowInsetLeft;
                            marginLayoutParams2.rightMargin = systemWindowInsetRight;
                            this.f10039D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f10072k);
                    this.f10039D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = systemWindowInsetLeft;
                    layoutParams.rightMargin = systemWindowInsetRight;
                    this.f10037B.addView(this.f10039D, -1, layoutParams);
                }
                View view3 = this.f10039D;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    f1(this.f10039D);
                }
                if (!this.f10044I && r5) {
                    systemWindowInsetTop = 0;
                }
                z4 = r5;
                r5 = z5;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z4 = false;
            } else {
                z4 = false;
                r5 = false;
            }
            if (r5) {
                this.f10083v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f10039D;
        if (view4 != null) {
            view4.setVisibility(z4 ? 0 : 8);
        }
        return systemWindowInsetTop;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View f0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z4;
        if (this.f10067f0 == null) {
            TypedArray obtainStyledAttributes = this.f10072k.obtainStyledAttributes(e.j.f36591y0);
            String string = obtainStyledAttributes.getString(e.j.f36371C0);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f10067f0 = new t();
            } else {
                try {
                    this.f10067f0 = (t) this.f10072k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f10067f0 = new t();
                }
            }
        }
        boolean z5 = f10033l0;
        boolean z6 = false;
        if (z5) {
            if (this.f10068g0 == null) {
                this.f10068g0 = new v();
            }
            if (this.f10068g0.a(attributeSet)) {
                z4 = true;
                return this.f10067f0.createView(view, str, context, attributeSet, z4, z5, true, j0.c());
            }
            if (!(attributeSet instanceof XmlPullParser)) {
                z6 = V0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z6 = true;
            }
        }
        z4 = z6;
        return this.f10067f0.createView(view, str, context, attributeSet, z4, z5, true, j0.c());
    }

    @Override // androidx.appcompat.app.g
    public Context g(Context context) {
        Context context2;
        this.f10051P = true;
        int C02 = C0(context, X());
        if (androidx.appcompat.app.g.v(context)) {
            androidx.appcompat.app.g.Q(context);
        }
        androidx.core.os.i W3 = W(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(d0(context2, C02, W3, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context2).applyOverrideConfiguration(d0(context2, C02, W3, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f10035n0) {
            return super.g(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration d02 = d0(context2, C02, W3, !configuration2.equals(configuration3) ? n0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context2, e.i.f36358c);
        dVar.applyOverrideConfiguration(d02);
        try {
            if (context2.getTheme() != null) {
                f.C0094f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.g(dVar);
    }

    void g0() {
        androidx.appcompat.view.menu.e eVar;
        InterfaceC1276z interfaceC1276z = this.f10079r;
        if (interfaceC1276z != null) {
            interfaceC1276z.i();
        }
        if (this.f10084w != null) {
            this.f10073l.getDecorView().removeCallbacks(this.f10085x);
            if (this.f10084w.isShowing()) {
                try {
                    this.f10084w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f10084w = null;
        }
        j0();
        PanelFeatureState t02 = t0(0, false);
        if (t02 == null || (eVar = t02.f10097j) == null) {
            return;
        }
        eVar.close();
    }

    boolean h0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f10070j;
        if (((obj instanceof AbstractC1319u.a) || (obj instanceof androidx.appcompat.app.r)) && (decorView = this.f10073l.getDecorView()) != null && AbstractC1319u.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f10074m.b(this.f10073l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? E0(keyCode, keyEvent) : H0(keyCode, keyEvent);
    }

    void i0(int i4) {
        PanelFeatureState t02;
        PanelFeatureState t03 = t0(i4, true);
        if (t03.f10097j != null) {
            Bundle bundle = new Bundle();
            t03.f10097j.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                t03.f10106s = bundle;
            }
            t03.f10097j.stopDispatchingItemsChanged();
            t03.f10097j.clear();
        }
        t03.f10105r = true;
        t03.f10104q = true;
        if ((i4 != 108 && i4 != 0) || this.f10079r == null || (t02 = t0(0, false)) == null) {
            return;
        }
        t02.f10100m = false;
        P0(t02, null);
    }

    @Override // androidx.appcompat.app.g
    public View j(int i4) {
        k0();
        return this.f10073l.findViewById(i4);
    }

    void j0() {
        C1301k0 c1301k0 = this.f10086y;
        if (c1301k0 != null) {
            c1301k0.c();
        }
    }

    @Override // androidx.appcompat.app.g
    public Context l() {
        return this.f10072k;
    }

    PanelFeatureState m0(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f10048M;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i4 = 0; i4 < length; i4++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i4];
            if (panelFeatureState != null && panelFeatureState.f10097j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.g
    public final InterfaceC1251b n() {
        return new f();
    }

    @Override // androidx.appcompat.app.g
    public int o() {
        return this.f10055T;
    }

    final Context o0() {
        AbstractC1250a s4 = s();
        Context k4 = s4 != null ? s4.k() : null;
        return k4 == null ? this.f10072k : k4;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return f0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.g
    public MenuInflater q() {
        if (this.f10077p == null) {
            w0();
            AbstractC1250a abstractC1250a = this.f10076o;
            this.f10077p = new androidx.appcompat.view.g(abstractC1250a != null ? abstractC1250a.k() : this.f10072k);
        }
        return this.f10077p;
    }

    @Override // androidx.appcompat.app.g
    public AbstractC1250a s() {
        w0();
        return this.f10076o;
    }

    androidx.core.os.i s0(Configuration configuration) {
        return k.b(configuration);
    }

    @Override // androidx.appcompat.app.g
    public void t() {
        LayoutInflater from = LayoutInflater.from(this.f10072k);
        if (from.getFactory() == null) {
            AbstractC1321v.a(from, this);
        } else {
            if (from.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    protected PanelFeatureState t0(int i4, boolean z4) {
        PanelFeatureState[] panelFeatureStateArr = this.f10048M;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i4) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i4 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f10048M = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i4];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i4);
        panelFeatureStateArr[i4] = panelFeatureState2;
        return panelFeatureState2;
    }

    @Override // androidx.appcompat.app.g
    public void u() {
        if (N0() == null || s().l()) {
            return;
        }
        A0(0);
    }

    final CharSequence u0() {
        Object obj = this.f10070j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f10078q;
    }

    final Window.Callback v0() {
        return this.f10073l.getCallback();
    }

    @Override // androidx.appcompat.app.g
    public void w(Configuration configuration) {
        AbstractC1250a s4;
        if (this.f10042G && this.f10036A && (s4 = s()) != null) {
            s4.m(configuration);
        }
        C1259h.b().g(this.f10072k);
        this.f10054S = new Configuration(this.f10072k.getResources().getConfiguration());
        S(false, false);
    }

    @Override // androidx.appcompat.app.g
    public void x(Bundle bundle) {
        String str;
        this.f10051P = true;
        R(false);
        l0();
        Object obj = this.f10070j;
        if (obj instanceof Activity) {
            try {
                str = androidx.core.app.q.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC1250a N02 = N0();
                if (N02 == null) {
                    this.f10064c0 = true;
                } else {
                    N02.r(true);
                }
            }
            androidx.appcompat.app.g.d(this);
        }
        this.f10054S = new Configuration(this.f10072k.getResources().getConfiguration());
        this.f10052Q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // androidx.appcompat.app.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y() {
        AbstractC1250a abstractC1250a;
        if (this.f10070j instanceof Activity) {
            androidx.appcompat.app.g.E(this);
        }
        if (this.f10061Z) {
            this.f10073l.getDecorView().removeCallbacks(this.f10063b0);
        }
        this.f10053R = true;
        if (this.f10055T != -100) {
            Object obj = this.f10070j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f10032k0.put(this.f10070j.getClass().getName(), Integer.valueOf(this.f10055T));
                abstractC1250a = this.f10076o;
                if (abstractC1250a != null) {
                    abstractC1250a.n();
                }
                a0();
            }
        }
        f10032k0.remove(this.f10070j.getClass().getName());
        abstractC1250a = this.f10076o;
        if (abstractC1250a != null) {
        }
        a0();
    }

    @Override // androidx.appcompat.app.g
    public void z(Bundle bundle) {
        k0();
    }

    AppCompatDelegateImpl(Dialog dialog, androidx.appcompat.app.e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        androidx.appcompat.app.d Z02;
        this.f10086y = null;
        this.f10087z = true;
        this.f10055T = -100;
        this.f10063b0 = new a();
        this.f10072k = context;
        this.f10075n = eVar;
        this.f10070j = obj;
        if (this.f10055T == -100 && (obj instanceof Dialog) && (Z02 = Z0()) != null) {
            this.f10055T = Z02.getDelegate().o();
        }
        if (this.f10055T == -100) {
            androidx.collection.g gVar = f10032k0;
            Integer num = (Integer) gVar.get(obj.getClass().getName());
            if (num != null) {
                this.f10055T = num.intValue();
                gVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            V(window);
        }
        C1259h.h();
    }
}
