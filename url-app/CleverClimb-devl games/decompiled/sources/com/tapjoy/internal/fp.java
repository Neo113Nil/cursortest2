package com.tapjoy.internal;

import android.util.Base64;
import com.tapjoy.TapjoyUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import java.util.zip.CRC32;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public final class fp {

    /* renamed from: a, reason: collision with root package name */
    public final a f8114a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8115b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8116c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8117d;
    private final String e;
    private final int f;

    /* loaded from: classes.dex */
    public enum a {
        SDK_ANDROID((byte) 2),
        RPC_ANALYTICS((byte) 49);


        /* renamed from: a, reason: collision with root package name */
        public byte f8119a;

        a(byte b2) {
            this.f8119a = b2;
        }

        @Nullable
        public static a a(byte b2) {
            for (a aVar : values()) {
                if (aVar.f8119a == b2) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public fp(String str) {
        int length = str.length();
        if (!str.matches("[A-Za-z0-9\\-_]*") || length < 60 || (length & 3) != 0) {
            throw new IllegalArgumentException("The given API key was malformed.");
        }
        try {
            byte[] decode = Base64.decode(str, 8);
            int length2 = decode.length;
            ByteBuffer wrap = ByteBuffer.wrap(decode);
            wrap.order(ByteOrder.BIG_ENDIAN);
            int length3 = decode.length - 4;
            int i = wrap.getInt(length3);
            CRC32 crc32 = new CRC32();
            crc32.update(decode, 0, length3);
            if (i != ((int) crc32.getValue())) {
                throw new IllegalArgumentException("The given API key was invalid.");
            }
            this.e = str;
            this.f8115b = new UUID(wrap.getLong(0), wrap.getLong(8)).toString();
            this.f = wrap.get(16);
            this.f8114a = a.a(wrap.get(17));
            this.f8116c = str.substring(24, 44);
            if (this.f == 1) {
                this.f8117d = null;
                return;
            }
            if (this.f != 2 || this.f8114a != a.SDK_ANDROID) {
                throw new IllegalArgumentException("The given API key was not supported.");
            }
            if (length2 < 57) {
                throw new IllegalArgumentException("The given API key was invalid.");
            }
            byte[] bArr = new byte[12];
            System.arraycopy(decode, 33, bArr, 0, 12);
            this.f8117d = TapjoyUtil.convertToHex(bArr);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("The given API key was malformed.", e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fp) {
            return this.e.equals(((fp) obj).e);
        }
        return false;
    }

    public final String toString() {
        return this.e;
    }

    public static String a(String str) {
        if (str.regionMatches(13, "-8000-8000-", 0, 11)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str.substring(0, 8));
            stringBuffer.append(str.substring(24, 30));
            stringBuffer.append(str.substring(9, 13));
            stringBuffer.append(str.substring(30));
            return stringBuffer.toString();
        }
        throw new IllegalArgumentException("The given UUID did not come from 5Rocks.");
    }
}
