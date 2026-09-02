package p0;

import S0.w;
import S0.y;
import android.util.Base64;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: e, reason: collision with root package name */
    public boolean f14700e;

    /* renamed from: f, reason: collision with root package name */
    public UUID f14701f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f14702g;

    @Override // p0.d
    public final Object b() {
        UUID uuid = this.f14701f;
        byte[] a3 = w.a(uuid, null, this.f14702g);
        byte[] bArr = this.f14702g;
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < bArr.length; i4 += 2) {
            sb.append((char) bArr[i4]);
        }
        String sb2 = sb.toString();
        byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
        byte b4 = decode[0];
        decode[0] = decode[3];
        decode[3] = b4;
        byte b5 = decode[1];
        decode[1] = decode[2];
        decode[2] = b5;
        byte b6 = decode[4];
        decode[4] = decode[5];
        decode[5] = b6;
        byte b7 = decode[6];
        decode[6] = decode[7];
        decode[7] = b7;
        return new C1343a(uuid, a3, new y[]{new y(true, null, 8, decode, 0, 0, null)});
    }

    @Override // p0.d
    public final boolean d(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // p0.d
    public final void f(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f14700e = false;
        }
    }

    @Override // p0.d
    public final void j(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f14700e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f14701f = UUID.fromString(attributeValue);
        }
    }

    @Override // p0.d
    public final void k(XmlPullParser xmlPullParser) {
        if (this.f14700e) {
            this.f14702g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
