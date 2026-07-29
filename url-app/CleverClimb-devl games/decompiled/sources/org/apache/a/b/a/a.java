package org.apache.a.b.a;

import java.io.UnsupportedEncodingException;
import java.util.List;
import org.apache.a.b.e.c;
import org.apache.a.e.g;
import org.apache.a.w;

/* compiled from: UrlEncodedFormEntity.java */
/* loaded from: classes2.dex */
public class a extends g {
    public a(List<? extends w> list, String str) throws UnsupportedEncodingException {
        super(c.a(list, str), str);
        StringBuilder sb = new StringBuilder();
        sb.append("application/x-www-form-urlencoded; charset=");
        sb.append(str == null ? "ISO-8859-1" : str);
        a(sb.toString());
    }
}
