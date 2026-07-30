package com.drake.net.convert;

import com.drake.net.exception.ConvertException;
import java.io.File;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.s;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.ByteString;

/* loaded from: classes3.dex */
public interface a {
    public static final C0258a DEFAULT = C0258a.$$INSTANCE;

    /* renamed from: com.drake.net.convert.a$a, reason: collision with other inner class name */
    public static final class C0258a implements a {
        static final /* synthetic */ C0258a $$INSTANCE = new C0258a();

        private C0258a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.drake.net.convert.a
        public <R> R onConvert(Type succeed, Response response) {
            Object obj;
            s.checkNotNullParameter(succeed, "succeed");
            s.checkNotNullParameter(response, "response");
            if (succeed == String.class && response.isSuccessful()) {
                ResponseBody body = response.body();
                if (body != null) {
                    obj = body.string();
                    return obj;
                }
                return null;
            }
            if (succeed == ByteString.class && response.isSuccessful()) {
                ResponseBody body2 = response.body();
                if (body2 != null) {
                    obj = body2.byteString();
                    return obj;
                }
                return null;
            }
            if ((succeed instanceof GenericArrayType) && ((GenericArrayType) succeed).getGenericComponentType() == Byte.TYPE && response.isSuccessful()) {
                ResponseBody body3 = response.body();
                if (body3 != null) {
                    obj = body3.bytes();
                    return obj;
                }
                return null;
            }
            if (succeed == File.class && response.isSuccessful()) {
                return (R) s4.a.file(response);
            }
            if (succeed == Response.class) {
                return response;
            }
            throw new ConvertException(response, "An exception occurred while converting the NetConverter.DEFAULT", null, null, 12, null);
        }
    }

    <R> R onConvert(Type type, Response response);
}
