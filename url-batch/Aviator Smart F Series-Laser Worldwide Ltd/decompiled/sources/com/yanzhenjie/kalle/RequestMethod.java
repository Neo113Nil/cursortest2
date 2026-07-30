package com.yanzhenjie.kalle;

import com.baidu.mapapi.http.wrapper.HttpManager;
import java.util.Locale;

/* loaded from: classes4.dex */
public enum RequestMethod {
    GET(HttpManager.HTTP_GET),
    POST(HttpManager.HTTP_POST),
    PUT(HttpManager.HTTP_PUT),
    DELETE(HttpManager.HTTP_DELETE),
    HEAD("HEAD"),
    PATCH("PATCH"),
    OPTIONS("OPTIONS"),
    TRACE("TRACE");

    private final String value;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$yanzhenjie$kalle$RequestMethod;

        static {
            int[] iArr = new int[RequestMethod.values().length];
            $SwitchMap$com$yanzhenjie$kalle$RequestMethod = iArr;
            try {
                iArr[RequestMethod.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$yanzhenjie$kalle$RequestMethod[RequestMethod.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$yanzhenjie$kalle$RequestMethod[RequestMethod.PATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$yanzhenjie$kalle$RequestMethod[RequestMethod.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    RequestMethod(String str) {
        this.value = str;
    }

    public static RequestMethod reverse(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        upperCase.hashCode();
        switch (upperCase) {
            case "OPTIONS":
                return OPTIONS;
            case "GET":
                return GET;
            case "PUT":
                return PUT;
            case "HEAD":
                return HEAD;
            case "POST":
                return POST;
            case "PATCH":
                return PATCH;
            case "TRACE":
                return TRACE;
            case "DELETE":
                return DELETE;
            default:
                return GET;
        }
    }

    public boolean allowBody() {
        int i8 = a.$SwitchMap$com$yanzhenjie$kalle$RequestMethod[ordinal()];
        return i8 == 1 || i8 == 2 || i8 == 3 || i8 == 4;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
