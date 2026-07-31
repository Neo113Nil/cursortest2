package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.a;

/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    final boolean f9827b = false;

    /* renamed from: c, reason: collision with root package name */
    final Handler f9828c = null;

    /* renamed from: d, reason: collision with root package name */
    android.support.v4.os.a f9829d;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResultReceiver[] newArray(int i4) {
            return new ResultReceiver[i4];
        }
    }

    class b extends a.AbstractBinderC0073a {
        b() {
        }

        @Override // android.support.v4.os.a
        public void h(int i4, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f9828c;
            if (handler != null) {
                handler.post(resultReceiver.new c(i4, bundle));
            } else {
                resultReceiver.a(i4, bundle);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final int f9831b;

        /* renamed from: c, reason: collision with root package name */
        final Bundle f9832c;

        c(int i4, Bundle bundle) {
            this.f9831b = i4;
            this.f9832c = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.a(this.f9831b, this.f9832c);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f9829d = a.AbstractBinderC0073a.i(parcel.readStrongBinder());
    }

    protected void a(int i4, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        synchronized (this) {
            try {
                if (this.f9829d == null) {
                    this.f9829d = new b();
                }
                parcel.writeStrongBinder(this.f9829d.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
