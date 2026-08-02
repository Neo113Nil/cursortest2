package net.idrnd.face.iad.capture.internal;

import android.util.CloseGuard;
import java.io.EOFException;
import java.io.IOException;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import org.apache.commons.imaging.ImageReadException;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.crypto.CryptoServiceConstraintsException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.eac.EACIOException;
import org.bouncycastle.operator.OperatorStreamException;
import org.bouncycastle.operator.RuntimeOperatorException;

/* loaded from: classes9.dex */
public final /* synthetic */ class f$$ExternalSyntheticLambda0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(int i, Object obj, Object obj2, Object obj3, String str) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void m$1(int i, int i2) {
        throw new CryptoServiceConstraintsException("service does not provide " + i + ((Object) " bits of security only ") + i2);
    }

    public static /* synthetic */ void m$2(String str, Object obj, Object obj2, Object obj3) {
        throw new KotlinReflectionInternalError(str + obj + obj2 + obj3 + ')');
    }

    public static /* synthetic */ void m$3(String str, Object obj, Object obj2, Object obj3) {
        throw new IOException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m$4(String str) {
        throw new DataLengthException(str);
    }

    public static /* synthetic */ void m$3(String str) {
        throw new OutputLengthException(str);
    }

    public static /* synthetic */ void m$1(Object obj, String str) {
        throw new KotlinReflectionInternalError(str + obj);
    }

    public static /* synthetic */ void m$1(Object obj, Throwable th) {
        throw new OperatorStreamException("exception in content signer: " + obj, th);
    }

    public static /* synthetic */ void m$2(String str) {
        throw new InvalidCipherTextException(str);
    }

    public static /* synthetic */ void m$1(String str) {
        throw new CMSException(str);
    }

    public static /* synthetic */ void m$2(Object obj, String str) {
        throw new KotlinReflectionInternalError(str + obj);
    }

    public static /* synthetic */ void m(int i, int i2) {
        throw new EOFException("DEF length " + i + ((Object) " object truncated by ") + i2);
    }

    public static /* synthetic */ void m$1(String str, Object obj, Object obj2) {
        throw new AssertionError(str + obj + obj2);
    }

    public static /* synthetic */ void m(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void m$1(String str, Object obj, Object obj2, Object obj3) {
        throw new KotlinReflectionInternalError(str + obj + obj2 + obj3);
    }

    public static /* bridge */ /* synthetic */ CloseGuard m(Object obj) {
        return (CloseGuard) obj;
    }

    public static /* synthetic */ void m$1(String str, Object obj, Throwable th) {
        throw new CertIOException(str + obj, th);
    }

    public static /* synthetic */ void m(Exception exc, String str) {
        throw new CMSException(str, exc);
    }

    public static /* synthetic */ void m(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, Object obj2, Object obj3, Object obj4, String str) {
        throw new AssertionError(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    public static /* synthetic */ void m(Object obj, Throwable th) {
        throw new EACIOException("malformed data: " + obj, th);
    }

    public static /* synthetic */ void m(String str) {
        throw new ImageReadException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(String str, int i, Object obj) {
        throw new IllegalArgumentException(str + ((char) i) + obj);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new KotlinReflectionInternalError(str + obj + obj2 + obj3 + ')');
    }

    public static /* synthetic */ void m(String str, Object obj, Throwable th) {
        throw new RuntimeOperatorException(str + obj, th);
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj) {
        sb.append(", ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }
}
