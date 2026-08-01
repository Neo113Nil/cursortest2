package q1;

import a2.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends p0.b {
    public static final Parcelable.Creator<a> CREATOR = new c(6);
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3128i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3129j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3130k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3131l;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = parcel.readInt();
        this.f3128i = parcel.readInt();
        this.f3129j = parcel.readInt() == 1;
        this.f3130k = parcel.readInt() == 1;
        this.f3131l = parcel.readInt() == 1;
    }

    @Override // p0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.h);
        parcel.writeInt(this.f3128i);
        parcel.writeInt(this.f3129j ? 1 : 0);
        parcel.writeInt(this.f3130k ? 1 : 0);
        parcel.writeInt(this.f3131l ? 1 : 0);
    }

    public a(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.h = bottomSheetBehavior.P;
        this.f3128i = bottomSheetBehavior.f1202f;
        this.f3129j = bottomSheetBehavior.f1195b;
        this.f3130k = bottomSheetBehavior.J;
        this.f3131l = bottomSheetBehavior.K;
    }
}
