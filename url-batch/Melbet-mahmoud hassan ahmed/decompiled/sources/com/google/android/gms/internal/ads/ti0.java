package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class ti0 extends s3.a {
    public static final Parcelable.Creator<ti0> CREATOR = new ui0();

    /* renamed from: f, reason: collision with root package name */
    ParcelFileDescriptor f12223f;

    /* renamed from: g, reason: collision with root package name */
    private Parcelable f12224g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12225h = true;

    public ti0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f12223f = parcelFileDescriptor;
    }

    public final <T extends s3.d> T c(Parcelable.Creator<T> creator) {
        if (this.f12225h) {
            ParcelFileDescriptor parcelFileDescriptor = this.f12223f;
            if (parcelFileDescriptor == null) {
                io0.d("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    v3.j.a(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.f12224g = creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.f12225h = false;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (IOException e7) {
                    io0.e("Could not read from parcel file descriptor", e7);
                    v3.j.a(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                v3.j.a(dataInputStream);
                throw th2;
            }
        }
        return (T) this.f12224g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] createPipe;
        if (this.f12223f == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f12224g.writeToParcel(obtain, 0);
                final byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                } catch (IOException e7) {
                    e = e7;
                    autoCloseOutputStream = null;
                }
                try {
                    wo0.f13894a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.si0
                        @Override // java.lang.Runnable
                        public final void run() {
                            DataOutputStream dataOutputStream;
                            OutputStream outputStream = autoCloseOutputStream;
                            byte[] bArr = marshall;
                            Parcelable.Creator<ti0> creator = ti0.CREATOR;
                            DataOutputStream dataOutputStream2 = null;
                            try {
                                try {
                                    dataOutputStream = new DataOutputStream(outputStream);
                                } catch (IOException e8) {
                                    e = e8;
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                v3.j.a(dataOutputStream);
                            } catch (IOException e9) {
                                e = e9;
                                dataOutputStream2 = dataOutputStream;
                                io0.e("Error transporting the ad response", e);
                                y2.t.p().s(e, "LargeParcelTeleporter.pipeData.1");
                                if (dataOutputStream2 == null) {
                                    v3.j.a(outputStream);
                                } else {
                                    v3.j.a(dataOutputStream2);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                dataOutputStream2 = dataOutputStream;
                                if (dataOutputStream2 == null) {
                                    v3.j.a(outputStream);
                                } else {
                                    v3.j.a(dataOutputStream2);
                                }
                                throw th;
                            }
                        }
                    });
                    parcelFileDescriptor = createPipe[0];
                } catch (IOException e8) {
                    e = e8;
                    io0.e("Error transporting the ad response", e);
                    y2.t.p().s(e, "LargeParcelTeleporter.pipeData.2");
                    v3.j.a(autoCloseOutputStream);
                    this.f12223f = parcelFileDescriptor;
                    int a7 = s3.c.a(parcel);
                    s3.c.l(parcel, 2, this.f12223f, i7, false);
                    s3.c.b(parcel, a7);
                }
                this.f12223f = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int a72 = s3.c.a(parcel);
        s3.c.l(parcel, 2, this.f12223f, i7, false);
        s3.c.b(parcel, a72);
    }
}
