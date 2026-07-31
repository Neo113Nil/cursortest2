package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import c4.w0;
import java.util.List;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0007a extends Binder implements a {

        /* renamed from: android.support.v4.media.session.a$a$a, reason: collision with other inner class name */
        private static class C0008a implements a {

            /* renamed from: g, reason: collision with root package name */
            public static a f466g;

            /* renamed from: f, reason: collision with root package name */
            private IBinder f467f;

            C0008a(IBinder iBinder) {
                this.f467f = iBinder;
            }

            @Override // android.support.v4.media.session.a
            public void S2(int i7) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i7);
                    if (this.f467f.transact(12, obtain, null, 1) || AbstractBinderC0007a.q0() == null) {
                        return;
                    }
                    AbstractBinderC0007a.q0().S2(i7);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void V5(PlaybackStateCompat playbackStateCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f467f.transact(3, obtain, null, 1) || AbstractBinderC0007a.q0() == null) {
                        return;
                    }
                    AbstractBinderC0007a.q0().V5(playbackStateCompat);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f467f;
            }

            @Override // android.support.v4.media.session.a
            public void n0(int i7) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i7);
                    if (this.f467f.transact(9, obtain, null, 1) || AbstractBinderC0007a.q0() == null) {
                        return;
                    }
                    AbstractBinderC0007a.q0().n0(i7);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void n6(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f467f.transact(8, obtain, null, 1) || AbstractBinderC0007a.q0() == null) {
                        return;
                    }
                    AbstractBinderC0007a.q0().n6(parcelableVolumeInfo);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void o1() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (this.f467f.transact(2, obtain, null, 1) || AbstractBinderC0007a.q0() == null) {
                        return;
                    }
                    AbstractBinderC0007a.q0().o1();
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void o5(boolean z6) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(z6 ? 1 : 0);
                    if (this.f467f.transact(11, obtain, null, 1) || AbstractBinderC0007a.q0() == null) {
                        return;
                    }
                    AbstractBinderC0007a.q0().o5(z6);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void u1(MediaMetadataCompat mediaMetadataCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f467f.transact(4, obtain, null, 1) || AbstractBinderC0007a.q0() == null) {
                        return;
                    }
                    AbstractBinderC0007a.q0().u1(mediaMetadataCompat);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void y3(List<MediaSessionCompat.QueueItem> list) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeTypedList(list);
                    if (this.f467f.transact(5, obtain, null, 1) || AbstractBinderC0007a.q0() == null) {
                        return;
                    }
                    AbstractBinderC0007a.q0().y3(list);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0007a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static a E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0008a(iBinder) : (a) queryLocalInterface;
        }

        public static a q0() {
            return C0008a.f466g;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            if (i7 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i7) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    W5(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    o1();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    V5(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    u1(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    y3(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    X0(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                    return true;
                case w0.f2149o /* 7 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    W2(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case w0.f2150p /* 8 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    n6(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    n0(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    V0(parcel.readInt() != 0);
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    o5(parcel.readInt() != 0);
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    S2(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    U2();
                    return true;
                default:
                    return super.onTransact(i7, parcel, parcel2, i8);
            }
        }
    }

    void S2(int i7);

    void U2();

    void V0(boolean z6);

    void V5(PlaybackStateCompat playbackStateCompat);

    void W2(Bundle bundle);

    void W5(String str, Bundle bundle);

    void X0(CharSequence charSequence);

    void n0(int i7);

    void n6(ParcelableVolumeInfo parcelableVolumeInfo);

    void o1();

    void o5(boolean z6);

    void u1(MediaMetadataCompat mediaMetadataCompat);

    void y3(List<MediaSessionCompat.QueueItem> list);
}
