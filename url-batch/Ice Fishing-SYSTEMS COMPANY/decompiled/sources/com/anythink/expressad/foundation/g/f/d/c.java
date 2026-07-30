package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.l;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class c extends e<JSONArray> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f19452c = "c";

    public c(int i, String str, String str2, com.anythink.expressad.foundation.g.f.e<JSONArray> eVar) {
        super(i, str, str2, eVar);
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    public final l<JSONArray> a(com.anythink.expressad.foundation.g.f.f.c cVar) {
        try {
            return l.a(new JSONArray(new String(cVar.f19478b, com.anythink.expressad.foundation.g.f.g.d.a(cVar.f19480d))), cVar);
        } catch (UnsupportedEncodingException e6) {
            e6.getMessage();
            return l.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        } catch (JSONException e9) {
            e9.getMessage();
            return l.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        }
    }
}
