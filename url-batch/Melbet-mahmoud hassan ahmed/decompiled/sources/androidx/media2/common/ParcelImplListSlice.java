package androidx.media2.common;

import android.annotation.SuppressLint;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImplListSlice implements Parcelable {
    public static final Parcelable.Creator<ParcelImplListSlice> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    final List<ParcelImpl> f1125f;

    class a extends Binder {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1126f;

        a(int i7) {
            this.f1126f = i7;
        }

        @Override // android.os.Binder
        protected boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            if (i7 != 1) {
                return super.onTransact(i7, parcel, parcel2, i8);
            }
            int readInt = parcel.readInt();
            while (readInt < this.f1126f && parcel2.dataSize() < 65536) {
                parcel2.writeInt(1);
                parcel2.writeParcelable(ParcelImplListSlice.this.f1125f.get(readInt), i8);
                readInt++;
            }
            if (readInt < this.f1126f) {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    class b implements Parcelable.Creator<ParcelImplListSlice> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelImplListSlice createFromParcel(Parcel parcel) {
            return new ParcelImplListSlice(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelImplListSlice[] newArray(int i7) {
            return new ParcelImplListSlice[i7];
        }
    }

    ParcelImplListSlice(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f1125f = new ArrayList(readInt);
        if (readInt <= 0) {
            return;
        }
        int i7 = 0;
        while (i7 < readInt && parcel.readInt() != 0) {
            this.f1125f.add((ParcelImpl) parcel.readParcelable(ParcelImpl.class.getClassLoader()));
            i7++;
        }
        if (i7 >= readInt) {
            return;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        while (i7 < readInt) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i7);
                readStrongBinder.transact(1, obtain, obtain2, 0);
                while (i7 < readInt && obtain2.readInt() != 0) {
                    this.f1125f.add((ParcelImpl) obtain2.readParcelable(ParcelImpl.class.getClassLoader()));
                    i7++;
                }
            } catch (RemoteException e7) {
                Log.w("ParcelImplListSlice", "Failure retrieving array; only received " + i7 + " of " + readInt, e7);
                return;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public ParcelImplListSlice(List<ParcelImpl> list) {
        Objects.requireNonNull(list, "list shouldn't be null");
        this.f1125f = list;
    }

    public List<ParcelImpl> a() {
        return this.f1125f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r7.writeInt(0);
        r7.writeStrongBinder(new androidx.media2.common.ParcelImplListSlice.a(r6, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return;
     */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void writeToParcel(Parcel parcel, int i7) {
        int size = this.f1125f.size();
        parcel.writeInt(size);
        if (size > 0) {
            int i8 = 0;
            while (i8 < size && i8 < 1 && parcel.dataSize() < 65536) {
                parcel.writeInt(1);
                parcel.writeParcelable(this.f1125f.get(i8), i7);
                i8++;
            }
        }
    }
}
