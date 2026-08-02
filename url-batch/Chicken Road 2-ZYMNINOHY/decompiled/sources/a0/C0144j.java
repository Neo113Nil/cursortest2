package a0;

import android.graphics.Path;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.rockchicken.pump.up.road.R;
import d2.C0389g;
import i2.AbstractC0457a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import m0.C1286H;
import m0.C1287I;
import m0.InterfaceC1290c;
import m0.InterfaceC1291d;

/* renamed from: a0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144j implements u0.p, h0.s, j0.k, j1.d, j.o, c2.h, u0.i, InterfaceC1290c, r0.n {

    /* renamed from: b, reason: collision with root package name */
    public static C0144j f4165b;

    /* renamed from: c, reason: collision with root package name */
    public static C0144j f4166c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4167a;

    public /* synthetic */ C0144j(int i4, Object obj) {
        this.f4167a = i4;
    }

    public static MediaCodec h(L1.h hVar) {
        String str = ((j0.o) hVar.f1633a).f13766a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static Path j(float f4, float f5, float f6, float f7) {
        Path path = new Path();
        path.moveTo(f4, f5);
        path.lineTo(f6, f7);
        return path;
    }

    @Override // m0.InterfaceC1290c
    public InterfaceC1291d a(int i4) {
        C1287I c1287i = new C1287I();
        C1287I c1287i2 = new C1287I();
        try {
            c1287i.f14335a.b(O3.d.p(0));
            int e4 = c1287i.e();
            boolean z = e4 % 2 == 0;
            c1287i2.f14335a.b(O3.d.p(z ? e4 + 1 : e4 - 1));
            if (z) {
                c1287i.f14336b = c1287i2;
                return c1287i;
            }
            c1287i2.f14336b = c1287i;
            return c1287i2;
        } catch (IOException e5) {
            AbstractC0457a.f(c1287i);
            AbstractC0457a.f(c1287i2);
            throw e5;
        }
    }

    @Override // c2.h
    public void accept(Object obj, Object obj2) {
        l2.c cVar = (l2.c) ((l2.b) obj).q();
        l2.f fVar = new l2.f((t2.d) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i4 = l2.a.f14266a;
        obtain.writeInt(1);
        O3.l.F(obtain, O3.l.D(obtain, 20293));
        obtain.writeStrongBinder(fVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f14267a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // m0.InterfaceC1290c
    public InterfaceC1290c b() {
        return new C1286H();
    }

    @Override // r0.n
    public long c() {
        throw new NoSuchElementException();
    }

    @Override // r0.n
    public long e() {
        throw new NoSuchElementException();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // j0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0.l f(L1.h hVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = h(hVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) hVar.f1636d;
            mediaCodec.configure((MediaFormat) hVar.f1634b, surface, (MediaCrypto) hVar.f1637e, (surface == null && ((j0.o) hVar.f1633a).f13773h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new C0389g(mediaCodec, (B1.j) hVar.f1638f);
        } catch (IOException e4) {
            e = e4;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            if (mediaCodec != null) {
            }
            throw e;
        }
    }

    @Override // u0.i
    public /* bridge */ /* synthetic */ void g(u0.k kVar, long j4, long j5) {
    }

    @Override // h0.s
    public u0.p i(h0.o oVar, h0.l lVar) {
        return new h0.r(oVar, lVar);
    }

    @Override // j1.d
    public void k() {
        switch (this.f4167a) {
            case 11:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // j1.d
    public void l(int i4, Object obj) {
        String str;
        switch (this.f4167a) {
            case 11:
                break;
            default:
                switch (i4) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i4 != 6 && i4 != 7 && i4 != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    @Override // u0.i
    public /* bridge */ /* synthetic */ void m(u0.k kVar, long j4, long j5, boolean z) {
    }

    @Override // r0.n
    public boolean next() {
        return false;
    }

    @Override // u0.i
    public g1.e p(u0.k kVar, long j4, long j5, IOException iOException, int i4) {
        return u0.n.f15482e;
    }

    @Override // j.o
    public boolean r(j.j jVar) {
        return false;
    }

    public CharSequence s(Preference preference) {
        switch (this.f4167a) {
            case 8:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                if (TextUtils.isEmpty(null)) {
                    return editTextPreference.f5114a.getString(R.string.not_set);
                }
                return null;
            default:
                ListPreference listPreference = (ListPreference) preference;
                if (TextUtils.isEmpty(null)) {
                    return listPreference.f5114a.getString(R.string.not_set);
                }
                return null;
        }
    }

    @Override // u0.p
    public Object u(Uri uri, Y.j jVar) {
        return Long.valueOf(W.J.P(new BufferedReader(new InputStreamReader(jVar)).readLine()));
    }

    @Override // h0.s
    public u0.p v() {
        return new h0.r(h0.o.f9156l, null);
    }

    public /* synthetic */ C0144j(int i4, boolean z) {
        this.f4167a = i4;
    }

    public C0144j(int i4) {
        this.f4167a = i4;
        switch (i4) {
            case 21:
                new p.e(0);
                new p.g();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 35) {
                    break;
                }
                break;
        }
    }

    private final void n() {
    }

    private final void q(int i4, Object obj) {
    }

    @Override // j.o
    public void d(j.j jVar, boolean z) {
    }
}
