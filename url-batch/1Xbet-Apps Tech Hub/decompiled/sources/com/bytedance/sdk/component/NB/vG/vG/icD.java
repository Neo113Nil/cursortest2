package com.bytedance.sdk.component.NB.vG.vG;

import java.io.Closeable;

/* compiled from: IOUtils.java */
/* loaded from: classes.dex */
public class icD {
    public static void pvs(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
