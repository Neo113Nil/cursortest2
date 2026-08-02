package org.bouncycastle.jce.provider;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.util.encoders.Base64;

/* loaded from: classes9.dex */
public class PEMUtil {
    private final String _footer1;
    private final String _footer2;
    private final String _header1;
    private final String _header2;

    public PEMUtil(String str) {
        this._header1 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("-----BEGIN ", str, "-----");
        this._header2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("-----BEGIN X509 ", str, "-----");
        this._footer1 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("-----END ", str, "-----");
        this._footer2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("-----END X509 ", str, "-----");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r3.length() == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String readLine(InputStream inputStream) {
        int read;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            read = inputStream.read();
            if (read == 13 || read == 10 || read < 0) {
                break;
            }
            if (read != 13) {
                stringBuffer.append((char) read);
            }
        }
        if (read < 0) {
            return null;
        }
        return stringBuffer.toString();
    }

    public ASN1Sequence readPEMObject(InputStream inputStream) {
        String readLine;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            readLine = readLine(inputStream);
            if (readLine == null || readLine.startsWith(this._header1)) {
                break;
            }
        } while (!readLine.startsWith(this._header2));
        while (true) {
            String readLine2 = readLine(inputStream);
            if (readLine2 == null || readLine2.startsWith(this._footer1) || readLine2.startsWith(this._footer2)) {
                break;
            }
            stringBuffer.append(readLine2);
        }
        if (stringBuffer.length() != 0) {
            ASN1Primitive readObject = new ASN1InputStream(Base64.decode(stringBuffer.toString())).readObject();
            if (readObject instanceof ASN1Sequence) {
                return (ASN1Sequence) readObject;
            }
            a$$ExternalSyntheticBUOutline0.m$4("malformed PEM data encountered");
        }
        return null;
    }
}
