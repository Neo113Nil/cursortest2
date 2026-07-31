package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.o9;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class ConnectivityHelperMetadata implements Serializable {
    private static final long serialVersionUID = -3942031112402817295L;

    @TypeInfo(complex = true)
    private Transport transport = new Transport();

    /* compiled from: Sta */
    public static class Transport implements Serializable {
        private static final long serialVersionUID = 9037003673849815220L;

        @TypeInfo(parser = o9.class)
        private int[][] active;

        @TypeInfo(parser = o9.class)
        private int[][] all = {new int[]{21, Integer.MAX_VALUE}};

        public final int[][] a() {
            return this.active;
        }

        public final int[][] b() {
            return this.all;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Transport transport = (Transport) obj;
                if (Arrays.deepEquals(this.all, transport.all) && Arrays.deepEquals(this.active, transport.active)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Object[] objArr = {this.all, this.active};
            WeakHashMap weakHashMap = zh.f528a;
            return Arrays.deepHashCode(objArr);
        }
    }

    public final Transport a() {
        return this.transport;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zh.a((Object) this.transport, (Object) ((ConnectivityHelperMetadata) obj).transport);
    }

    public final int hashCode() {
        Object[] objArr = {this.transport};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }
}
