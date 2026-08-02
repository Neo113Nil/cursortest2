package okio;

import androidx.core.splashscreen.SplashScreen$KeepOnScreenCondition;
import com.squareup.cash.ui.MainActivity;
import com.squareup.moshi.JsonDataException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final /* synthetic */ class Path$$ExternalSyntheticBUOutline0 implements SplashScreen$KeepOnScreenCondition {
    public final /* synthetic */ int $r8$classId;

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + '\'').toString());
    }

    public static /* synthetic */ void m$1(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m$2(int i, String str) {
        throw new IllegalArgumentException(str + ((char) i));
    }

    public static /* synthetic */ void m$3(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    @Override // androidx.core.splashscreen.SplashScreen$KeepOnScreenCondition
    public boolean shouldKeepOnScreen() {
        switch (this.$r8$classId) {
            case 1:
                int i = MainActivity.$r8$clinit;
                return true;
            default:
                int i2 = MainActivity.$r8$clinit;
                return false;
        }
    }

    public static /* synthetic */ void m$2() {
        throw new AssertionError();
    }

    public static /* synthetic */ void m$2(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void m$3(int i, String str) {
        throw new IOException(str + i);
    }

    public static /* synthetic */ void m$3() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void m$1(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void m$1(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void m$1(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void m$1(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void m$1(String str) {
        throw new EOFException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(int i, Object obj, Object obj2, Object obj3, String str) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m$1(String str, int i, Object obj) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void m(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void m$1() {
        throw new EOFException();
    }

    public static /* synthetic */ void m(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void m(Object obj, Object obj2, Object obj3, Object obj4, String str) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(String str, int i, Object obj) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new JsonDataException(str + obj + ((Object) " at path ") + obj2);
    }

    public static /* synthetic */ void m() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new JsonDataException(sb.toString());
    }

    public static /* synthetic */ void m(Throwable th) {
        throw new IllegalArgumentException(th);
    }
}
