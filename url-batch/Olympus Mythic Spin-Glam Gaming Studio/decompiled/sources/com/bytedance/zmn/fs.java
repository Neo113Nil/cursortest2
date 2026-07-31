package com.bytedance.zmn;

import com.bytedance.zmn.zmn;
import com.bytedance.zmn.zn;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public abstract class fs<T extends zmn<?>> {
    public abstract long btk();

    public abstract int bvs();

    public abstract String fb();

    public abstract int fs();

    public abstract boolean hhw();

    public abstract long iv();

    public abstract zn.InterfaceC0213zn nps();

    public abstract int zg();

    public abstract long zmn();

    public abstract T zmn(String str, byte[] bArr, int i, int i2);

    public abstract void zmn(ArrayList<T> arrayList, zn.fs<T> fsVar);

    public final String zn() {
        return "CREATE TABLE IF NOT EXISTS " + fb() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, data_id TEXT UNIQUE, data BLOB, priority INTEGER DEFAULT 0, upload_retry_count INTEGER DEFAULT 0, create_time INTEGER);";
    }
}
