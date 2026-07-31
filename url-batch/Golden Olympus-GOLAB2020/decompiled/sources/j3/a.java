package j3;

import android.content.Context;
import android.content.SharedPreferences;
import f2.AbstractC2420c;
import f2.i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f40857a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile String f40858b;

    public static final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = f40858b;
        if (str != null) {
            return str;
        }
        synchronized (f40857a) {
            String str2 = f40858b;
            if (str2 != null) {
                return str2;
            }
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            String b4 = b(applicationContext);
            f40858b = b4;
            return b4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0044, code lost:
    
        if (r1.length() > 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String b(Context context) {
        String obj;
        String str;
        SharedPreferences sharedPreferences = context.getSharedPreferences("tracer", 0);
        String string = sharedPreferences.getString("device_id", null);
        String str2 = string == null ? "00000000-0000-0000-0000-000000000000" : string;
        try {
            File filesDir = context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(filesDir, "context.filesDir");
            File o4 = i.o(n3.a.b(i.o(filesDir, "tracer")), "device_id.txt");
            if (o4.exists()) {
                try {
                    obj = StringsKt.W0(i.e(o4, null, 1, null)).toString();
                } catch (IOException unused) {
                }
            }
            obj = null;
            if (obj != null) {
                return obj;
            }
            if (string == null) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            } else {
                str = string;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(o4);
            try {
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.getFD().sync();
                Unit unit = Unit.f41027a;
                AbstractC2420c.a(fileOutputStream, null);
                if (string != null) {
                    sharedPreferences.edit().remove("device_id").apply();
                }
                return str;
            } finally {
            }
        } catch (IOException unused2) {
            return str2;
        }
    }
}
