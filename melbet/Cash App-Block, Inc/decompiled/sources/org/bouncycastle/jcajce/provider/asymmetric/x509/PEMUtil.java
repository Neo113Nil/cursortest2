package org.bouncycastle.jcajce.provider.asymmetric.x509;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.util.encoders.Base64;

/* loaded from: classes9.dex */
class PEMUtil {
    private final Boundaries[] _supportedBoundaries;

    public static class Boundaries {
        private final String _footer;
        private final String _header;

        private Boundaries(String str) {
            this._header = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("-----BEGIN ", str, "-----");
            this._footer = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("-----END ", str, "-----");
        }

        public boolean isTheExpectedFooter(String str) {
            return str.startsWith(this._footer);
        }

        public boolean isTheExpectedHeader(String str) {
            return str.startsWith(this._header);
        }
    }

    public PEMUtil(String str) {
        this._supportedBoundaries = new Boundaries[]{new Boundaries(str), new Boundaries(Recorder$$ExternalSyntheticOutline2.m("X509 ", str)), new Boundaries(PEMParser.TYPE_PKCS7)};
    }

    private Boundaries getBoundaries(String str) {
        Boundaries boundaries;
        int i = 0;
        while (true) {
            Boundaries[] boundariesArr = this._supportedBoundaries;
            if (i == boundariesArr.length) {
                return null;
            }
            boundaries = boundariesArr[i];
            if (boundaries.isTheExpectedHeader(str) || boundaries.isTheExpectedFooter(str)) {
                break;
            }
            i++;
        }
        return boundaries;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r4.length() == 0) goto L33;
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
            stringBuffer.append((char) read);
        }
        if (read < 0) {
            if (stringBuffer.length() == 0) {
                return null;
            }
            return stringBuffer.toString();
        }
        if (read == 13) {
            inputStream.mark(1);
            int read2 = inputStream.read();
            if (read2 == 10) {
                inputStream.mark(1);
            }
            if (read2 > 0) {
                inputStream.reset();
            }
        }
        return stringBuffer.toString();
    }

    public ASN1Sequence readPEMObject(InputStream inputStream, boolean z) {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        Boundaries boundaries = null;
        while (boundaries == null) {
            String readLine = readLine(inputStream);
            if (readLine == null) {
                break;
            }
            boundaries = getBoundaries(readLine);
            if (boundaries != null && !boundaries.isTheExpectedHeader(readLine)) {
                str = "malformed PEM data: found footer where header was expected";
                break;
            }
        }
        if (boundaries != null) {
            Boundaries boundaries2 = null;
            while (boundaries2 == null) {
                String readLine2 = readLine(inputStream);
                if (readLine2 == null) {
                    break;
                }
                boundaries2 = getBoundaries(readLine2);
                if (boundaries2 == null) {
                    stringBuffer.append(readLine2);
                } else if (!boundaries.isTheExpectedFooter(readLine2)) {
                    str = "malformed PEM data: header/footer mismatch";
                    break;
                }
            }
            if (boundaries2 == null) {
                str = "malformed PEM data: no footer found";
            } else {
                if (stringBuffer.length() == 0) {
                    return null;
                }
                try {
                    return ASN1Sequence.getInstance(Base64.decode(stringBuffer.toString()));
                } catch (Exception unused) {
                    str = "malformed PEM data encountered";
                }
            }
        } else {
            if (!z) {
                return null;
            }
            str = "malformed PEM data: no header found";
        }
        a$$ExternalSyntheticBUOutline0.m$4(str);
        return null;
    }
}
