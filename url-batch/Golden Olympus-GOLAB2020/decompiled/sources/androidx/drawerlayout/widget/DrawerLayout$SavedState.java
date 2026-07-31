package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes.dex */
public class DrawerLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<DrawerLayout$SavedState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    int f12116b;

    /* renamed from: c, reason: collision with root package name */
    int f12117c;

    /* renamed from: d, reason: collision with root package name */
    int f12118d;

    /* renamed from: e, reason: collision with root package name */
    int f12119e;

    /* renamed from: f, reason: collision with root package name */
    int f12120f;

    class a implements Parcelable.ClassLoaderCreator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrawerLayout$SavedState createFromParcel(Parcel parcel) {
            return new DrawerLayout$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DrawerLayout$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new DrawerLayout$SavedState(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public DrawerLayout$SavedState[] newArray(int i4) {
            return new DrawerLayout$SavedState[i4];
        }
    }

    public DrawerLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f12116b = 0;
        this.f12116b = parcel.readInt();
        this.f12117c = parcel.readInt();
        this.f12118d = parcel.readInt();
        this.f12119e = parcel.readInt();
        this.f12120f = parcel.readInt();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f12116b);
        parcel.writeInt(this.f12117c);
        parcel.writeInt(this.f12118d);
        parcel.writeInt(this.f12119e);
        parcel.writeInt(this.f12120f);
    }
}
