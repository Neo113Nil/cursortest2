package k5;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import w0.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends w3.b {
    public static final Parcelable.Creator<f> CREATOR = new o(2);

    /* renamed from: f, reason: collision with root package name */
    public final int f4191f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4192g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4193h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4194j;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4191f = parcel.readInt();
        this.f4192g = parcel.readInt();
        this.f4193h = parcel.readInt() == 1;
        this.i = parcel.readInt() == 1;
        this.f4194j = parcel.readInt() == 1;
    }

    @Override // w3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4191f);
        parcel.writeInt(this.f4192g);
        parcel.writeInt(this.f4193h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f4194j ? 1 : 0);
    }

    public f(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f4191f = bottomSheetBehavior.N;
        this.f4192g = bottomSheetBehavior.f1848e;
        this.f4193h = bottomSheetBehavior.f1842b;
        this.i = bottomSheetBehavior.I;
        this.f4194j = bottomSheetBehavior.J;
    }
}
