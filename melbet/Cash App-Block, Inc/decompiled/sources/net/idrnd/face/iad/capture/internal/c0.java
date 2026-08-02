package net.idrnd.face.iad.capture.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import kotlin.Result;

/* loaded from: classes9.dex */
public final class c0 {
    public final /* synthetic */ int $r8$classId = 1;
    public Serializable a;
    public Serializable b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public int f;
    public int g;
    public int h;
    public Serializable i;

    public c0(byte[] bArr) {
        Object failure;
        Object failure2;
        SecureRandom instanceStrong = SecureRandom.getInstanceStrong();
        instanceStrong.getClass();
        this.b = instanceStrong;
        this.c = new OAEPParameterSpec(b0.a(4), b0.a(5), new MGF1ParameterSpec(b0.a(4)), PSource.PSpecified.DEFAULT);
        this.d = b0.a(0);
        this.e = b0.a(1);
        this.f = 256;
        this.g = 96;
        this.h = 128;
        this.i = b0.a(2);
        try {
            Result.Companion companion = Result.Companion;
            failure = new X509EncodedKeySpec(bArr);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        boolean z = failure instanceof Result.Failure;
        if (z) {
            Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
            m4120exceptionOrNullimpl.getClass();
            if (!(m4120exceptionOrNullimpl instanceof NullPointerException)) {
                throw new w();
            }
            throw new x();
        }
        failure = z ? null : failure;
        failure.getClass();
        try {
            failure2 = KeyFactory.getInstance((String) this.d).generatePublic((X509EncodedKeySpec) failure);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            failure2 = new Result.Failure(th2);
        }
        boolean z2 = failure2 instanceof Result.Failure;
        if (z2) {
            throw new w();
        }
        Object obj = z2 ? null : failure2;
        obj.getClass();
        this.a = (PublicKey) obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int[], java.io.Serializable] */
    public void add(int i, String str) {
        int i2 = this.h;
        int[] iArr = (int[]) this.e;
        if (i2 >= iArr.length) {
            this.e = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = (String[]) this.i;
            this.i = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = (int[]) this.e;
        int i3 = this.h;
        iArr2[i3] = i;
        String[] strArr2 = (String[]) this.i;
        this.h = i3 + 1;
        strArr2[i3] = str;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 1:
                StringBuilder sb = new StringBuilder("TypedBundle{mCountInt=");
                sb.append(this.f);
                sb.append(", mCountFloat=");
                sb.append(this.g);
                sb.append(", mCountString=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.h, ", mCountBoolean=0}", sb);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [float[], java.io.Serializable] */
    public void add(float f, int i) {
        int i2 = this.g;
        int[] iArr = (int[]) this.c;
        if (i2 >= iArr.length) {
            this.c = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = (float[]) this.d;
            this.d = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = (int[]) this.c;
        int i3 = this.g;
        iArr2[i3] = i;
        float[] fArr2 = (float[]) this.d;
        this.g = i3 + 1;
        fArr2[i3] = f;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int[], java.io.Serializable] */
    public void add(int i, int i2) {
        int i3 = this.f;
        int[] iArr = (int[]) this.a;
        if (i3 >= iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = (int[]) this.b;
            this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = (int[]) this.a;
        int i4 = this.f;
        iArr3[i4] = i;
        int[] iArr4 = (int[]) this.b;
        this.f = i4 + 1;
        iArr4[i4] = i2;
    }

    public /* synthetic */ c0() {
    }
}
