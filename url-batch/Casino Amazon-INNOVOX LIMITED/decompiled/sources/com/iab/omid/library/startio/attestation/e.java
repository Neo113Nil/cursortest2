package com.iab.omid.library.startio.attestation;

import android.content.Context;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final d f20a = new d();

    public static void a(Context context, String str, a aVar) {
        StringBuilder append;
        String str2;
        if (context == null) {
            str2 = "Attestation failed: Application Context cannot be null";
        } else {
            if (str != null) {
                try {
                    if (!str.trim().isEmpty()) {
                        if (aVar != null) {
                            if (c.a(context).a(str)) {
                                b a2 = f20a.a(str, context);
                                if (a2 != null) {
                                    a2.a(aVar);
                                    return;
                                }
                                append = new StringBuilder("Failed to create mechanism: ").append(str);
                            } else {
                                append = new StringBuilder("Mechanism not supported on this device: ").append(str);
                            }
                            com.iab.omid.library.startio.utils.d.d(append.toString());
                            return;
                        }
                        str2 = "Attestation failed: Attestation arguments cannot be null";
                    }
                } catch (Exception e) {
                    com.iab.omid.library.startio.utils.d.a("Error during attestation with mechanism: " + str, e);
                    return;
                }
            }
            str2 = "Attestation failed: Mechanism name cannot be null or empty";
        }
        com.iab.omid.library.startio.utils.d.b(str2);
    }
}
