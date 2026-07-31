package com.iab.omid.library.startio.internal;

import android.view.View;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class f {
    private static final Pattern b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final List f35a = new ArrayList();

    private void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    private e b(View view) {
        for (e eVar : this.f35a) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    public List a() {
        return this.f35a;
    }

    public void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        a(view);
        a(str);
        if (b(view) == null) {
            this.f35a.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public void b() {
        this.f35a.clear();
    }

    public void c(View view) {
        a(view);
        e b2 = b(view);
        if (b2 != null) {
            this.f35a.remove(b2);
        }
    }
}
