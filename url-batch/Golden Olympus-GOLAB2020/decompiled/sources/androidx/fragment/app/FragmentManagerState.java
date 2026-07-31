package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    ArrayList f12375b;

    /* renamed from: c, reason: collision with root package name */
    ArrayList f12376c;

    /* renamed from: d, reason: collision with root package name */
    BackStackRecordState[] f12377d;

    /* renamed from: e, reason: collision with root package name */
    int f12378e;

    /* renamed from: f, reason: collision with root package name */
    String f12379f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList f12380g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList f12381h;

    /* renamed from: i, reason: collision with root package name */
    ArrayList f12382i;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i4) {
            return new FragmentManagerState[i4];
        }
    }

    public FragmentManagerState() {
        this.f12379f = null;
        this.f12380g = new ArrayList();
        this.f12381h = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f12375b);
        parcel.writeStringList(this.f12376c);
        parcel.writeTypedArray(this.f12377d, i4);
        parcel.writeInt(this.f12378e);
        parcel.writeString(this.f12379f);
        parcel.writeStringList(this.f12380g);
        parcel.writeTypedList(this.f12381h);
        parcel.writeTypedList(this.f12382i);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f12379f = null;
        this.f12380g = new ArrayList();
        this.f12381h = new ArrayList();
        this.f12375b = parcel.createStringArrayList();
        this.f12376c = parcel.createStringArrayList();
        this.f12377d = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f12378e = parcel.readInt();
        this.f12379f = parcel.readString();
        this.f12380g = parcel.createStringArrayList();
        this.f12381h = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f12382i = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
