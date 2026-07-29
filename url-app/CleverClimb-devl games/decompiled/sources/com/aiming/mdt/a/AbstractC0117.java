package com.aiming.mdt.a;

import com.aiming.mdt.a.C0172;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* renamed from: com.aiming.mdt.a.ʼʽʾˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0117 {

    /* renamed from: ʼ, reason: contains not printable characters */
    private URLConnection f332;

    AbstractC0117() {
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static C0110 m434(Map<String, List<String>> map) {
        C0110 c0110 = new C0110();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            c0110.m418(entry.getKey(), entry.getValue());
        }
        return c0110;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private C0052 m435(C0172 c0172) {
        try {
            try {
                int mo52 = mo52();
                if (mo52 >= 400) {
                    throw new C0168(String.format("%s RequestCode:%d", this.f332.getURL().toString(), Integer.valueOf(mo52)));
                }
                InputStream inputStream = this.f332.getInputStream();
                BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream);
                if (c0172.m651()) {
                    C0110 m434 = m434(this.f332.getHeaderFields());
                    return C0052.m162().m173(mo52).m174(m434).m170(new C0185(m434.m409(), bufferedInputStream)).m172(this).m171();
                }
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception e) {
                        C0282.m972("IOUtil", e);
                        C0076.m232().m236(e);
                    }
                }
                bufferedInputStream.close();
                mo51();
                return null;
            } catch (SocketTimeoutException e2) {
                throw new C0168(String.format("Read data time out: %1$s.", this.f332.getURL().toString()), e2);
            }
        } catch (Exception e3) {
            if (e3 instanceof C0168) {
                throw new C0168(e3);
            }
            Exception exc = new Exception(c0172.m649(), e3);
            C0076.m232().m236(exc);
            throw new C0168(exc);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static boolean m436(C0172.EnumC0173 enumC0173) {
        return enumC0173.equals(C0172.EnumC0173.f594);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final C0052 m437(C0172 c0172) {
        if (!C0079.m244(c0172.m653())) {
            throw new C0058("Network is not available,please check network");
        }
        if (m436(c0172.m644())) {
            C0110 m642 = c0172.m642();
            InterfaceC0041 m647 = c0172.m647();
            if (m647 != null && m642 != null) {
                m642.m415("Content-Length", Long.toString(m647.mo98()));
                m642.m415(Constants.KEY_CONTENT_TYPE, m647.mo96());
            }
            this.f332 = mo50(c0172);
            if (m647 != null) {
                try {
                    OutputStream outputStream = this.f332.getOutputStream();
                    m647.mo97(outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream));
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Exception e) {
                            C0282.m972("IOUtil", e);
                            C0076.m232().m236(e);
                        }
                    }
                } catch (Exception e2) {
                    throw new C0058(e2);
                }
            }
        } else {
            this.f332 = mo50(c0172);
        }
        return m435(c0172);
    }

    /* renamed from: ʼ */
    public abstract URLConnection mo50(C0172 c0172);

    /* renamed from: ʼ */
    public abstract void mo51();

    /* renamed from: ʽ */
    abstract int mo52();
}
