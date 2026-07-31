package com.bytedance.sdk.openadsdk.core.rt.fs;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.rt.fs.zn;

/* loaded from: classes10.dex */
public class zmn extends zn implements Comparable<zmn> {
    public long zmn;

    protected zmn(long j, String str, zn.EnumC0181zn enumC0181zn, Boolean bool) {
        super(str, enumC0181zn, bool);
        this.zmn = j;
    }

    public long zmn() {
        return this.zmn;
    }

    public static int zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] split = str.split(":");
        if (split.length == 3) {
            try {
                return (int) ((Integer.parseInt(split[0]) * 3600000) + (Integer.parseInt(split[1]) * 60000) + (Float.parseFloat(split[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean zmn(long j) {
        return this.zmn <= j && !fb();
    }

    @Override // java.lang.Comparable
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public int compareTo(zmn zmnVar) {
        if (zmnVar == null) {
            return 1;
        }
        long j = this.zmn;
        long j2 = zmnVar.zmn;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.rt.fs.zmn$zmn, reason: collision with other inner class name */
    public static class C0180zmn {
        private final long fs;
        private final String zmn;
        private zn.EnumC0181zn zn = zn.EnumC0181zn.TRACKING_URL;

        public C0180zmn(String str, long j) {
            this.zmn = str;
            this.fs = j;
        }

        public zmn zmn() {
            return new zmn(this.fs, this.zmn, this.zn, Boolean.FALSE);
        }
    }

    public String toString() {
        return super.toString();
    }
}
