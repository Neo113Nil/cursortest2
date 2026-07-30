package cn.hutool.core.net;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* loaded from: classes.dex */
public class m extends Authenticator {
    private final char[] pass;
    private final String user;

    public m(String str, char[] cArr) {
        this.user = str;
        this.pass = cArr;
    }

    @Override // java.net.Authenticator
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.user, this.pass);
    }
}
