package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class yj {

    class a extends GZIPOutputStream {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f20436a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(OutputStream outputStream, int i4) {
            super(outputStream);
            this.f20436a = i4;
            if (i4 < 0 || i4 > 9) {
                return;
            }
            ((GZIPOutputStream) this).def.setLevel(i4);
        }
    }

    public static String a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return sb.toString();
                }
                sb.append(readLine);
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("exception while decompressing " + e4);
            return null;
        } catch (OutOfMemoryError e5) {
            o9.d().a(e5);
            String str = "Error while decompressing:" + e5.getMessage();
            IronLog.INTERNAL.error(str);
            b(str);
            return null;
        }
    }

    private static void b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        br.i().a(new zb(81321, jSONObject));
    }

    public static byte[] a(String str) {
        return a(str, -1);
    }

    public static byte[] a(String str, int i4) {
        byte[] bArr = new byte[0];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            a aVar = new a(byteArrayOutputStream, i4);
            aVar.write(str.getBytes());
            aVar.close();
            bArr = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return bArr;
        } catch (OutOfMemoryError e4) {
            o9.d().a(e4);
            String str2 = "Error while compressing:" + e4.getMessage();
            IronLog.INTERNAL.error(str2);
            b(str2);
            return bArr;
        }
    }
}
