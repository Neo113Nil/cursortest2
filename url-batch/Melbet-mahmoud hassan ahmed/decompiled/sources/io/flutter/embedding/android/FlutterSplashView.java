package io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.embedding.android.k;

/* loaded from: classes.dex */
final class FlutterSplashView extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    private static String f17048o = "FlutterSplashView";

    /* renamed from: f, reason: collision with root package name */
    private v f17049f;

    /* renamed from: g, reason: collision with root package name */
    private k f17050g;

    /* renamed from: h, reason: collision with root package name */
    private View f17051h;

    /* renamed from: i, reason: collision with root package name */
    Bundle f17052i;

    /* renamed from: j, reason: collision with root package name */
    private String f17053j;

    /* renamed from: k, reason: collision with root package name */
    private String f17054k;

    /* renamed from: l, reason: collision with root package name */
    private final k.f f17055l;

    /* renamed from: m, reason: collision with root package name */
    private final k5.b f17056m;

    /* renamed from: n, reason: collision with root package name */
    private final Runnable f17057n;

    @Keep
    public static class SavedState extends View.BaseSavedState {
        public static Parcelable.Creator<SavedState> CREATOR = new a();
        private String previousCompletedSplashIsolate;
        private Bundle splashScreenState;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.previousCompletedSplashIsolate = parcel.readString();
            this.splashScreenState = parcel.readBundle(getClass().getClassLoader());
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeString(this.previousCompletedSplashIsolate);
            parcel.writeBundle(this.splashScreenState);
        }
    }

    class a implements k.f {
        a() {
        }

        @Override // io.flutter.embedding.android.k.f
        public void a() {
        }

        @Override // io.flutter.embedding.android.k.f
        public void b(io.flutter.embedding.engine.a aVar) {
            FlutterSplashView.this.f17050g.y(this);
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.g(flutterSplashView.f17050g, FlutterSplashView.this.f17049f);
        }
    }

    class b implements k5.b {
        b() {
        }

        @Override // k5.b
        public void c() {
        }

        @Override // k5.b
        public void f() {
            if (FlutterSplashView.this.f17049f != null) {
                FlutterSplashView.this.k();
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.removeView(flutterSplashView.f17051h);
            FlutterSplashView flutterSplashView2 = FlutterSplashView.this;
            flutterSplashView2.f17054k = flutterSplashView2.f17053j;
        }
    }

    public FlutterSplashView(Context context) {
        this(context, null, 0);
    }

    public FlutterSplashView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f17055l = new a();
        this.f17056m = new b();
        this.f17057n = new c();
        setSaveEnabled(true);
    }

    private boolean h() {
        k kVar = this.f17050g;
        if (kVar == null) {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterView is set.");
        }
        if (kVar.w()) {
            return this.f17050g.getAttachedFlutterEngine().i().l() != null && this.f17050g.getAttachedFlutterEngine().i().l().equals(this.f17054k);
        }
        throw new IllegalStateException("Cannot determine if splash has completed when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
    }

    private boolean i() {
        k kVar = this.f17050g;
        return (kVar == null || !kVar.w() || this.f17050g.u() || h()) ? false : true;
    }

    private boolean j() {
        v vVar;
        k kVar = this.f17050g;
        return kVar != null && kVar.w() && (vVar = this.f17049f) != null && vVar.b() && l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f17053j = this.f17050g.getAttachedFlutterEngine().i().l();
        z4.b.e(f17048o, "Transitioning splash screen to a Flutter UI. Isolate: " + this.f17053j);
        this.f17049f.a(this.f17057n);
    }

    private boolean l() {
        k kVar = this.f17050g;
        if (kVar == null) {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterView is set.");
        }
        if (kVar.w()) {
            return this.f17050g.u() && !h();
        }
        throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
    }

    public void g(k kVar, v vVar) {
        k kVar2 = this.f17050g;
        if (kVar2 != null) {
            kVar2.z(this.f17056m);
            removeView(this.f17050g);
        }
        View view = this.f17051h;
        if (view != null) {
            removeView(view);
        }
        this.f17050g = kVar;
        addView(kVar);
        this.f17049f = vVar;
        if (vVar != null) {
            if (i()) {
                z4.b.e(f17048o, "Showing splash screen UI.");
                View c7 = vVar.c(getContext(), this.f17052i);
                this.f17051h = c7;
                addView(c7);
                kVar.l(this.f17056m);
                return;
            }
            if (!j()) {
                if (kVar.w()) {
                    return;
                }
                z4.b.e(f17048o, "FlutterView is not yet attached to a FlutterEngine. Showing nothing until a FlutterEngine is attached.");
                kVar.k(this.f17055l);
                return;
            }
            z4.b.e(f17048o, "Showing an immediate splash transition to Flutter due to previously interrupted transition.");
            View c8 = vVar.c(getContext(), this.f17052i);
            this.f17051h = c8;
            addView(c8);
            k();
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f17054k = savedState.previousCompletedSplashIsolate;
        this.f17052i = savedState.splashScreenState;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.previousCompletedSplashIsolate = this.f17054k;
        v vVar = this.f17049f;
        savedState.splashScreenState = vVar != null ? vVar.d() : null;
        return savedState;
    }
}
