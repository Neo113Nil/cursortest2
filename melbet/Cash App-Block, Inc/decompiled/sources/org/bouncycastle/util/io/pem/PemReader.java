package org.bouncycastle.util.io.pem;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.util.encoders.Base64;

/* loaded from: classes8.dex */
public class PemReader extends BufferedReader {
    private static final String BEGIN = "-----BEGIN ";
    private static final String END = "-----END ";
    public static final String LAX_PEM_PARSING_SYSTEM_PROPERTY_NAME = "org.bouncycastle.pemreader.lax";
    private static final Logger LOG = Logger.getLogger(PemReader.class.getName());

    public PemReader(Reader reader) {
        super(reader);
    }

    private PemObject loadObject(String str) {
        String readLine;
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(END, str, "-----");
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (true) {
            readLine = readLine();
            if (readLine == null) {
                break;
            }
            int indexOf = readLine.indexOf(58);
            if (indexOf >= 0) {
                arrayList.add(new PemHeader(readLine.substring(0, indexOf), readLine.substring(indexOf + 1).trim()));
            } else {
                if (System.getProperty(LAX_PEM_PARSING_SYSTEM_PROPERTY_NAME, "false").equalsIgnoreCase("true")) {
                    String trim = readLine.trim();
                    if (!trim.equals(readLine)) {
                        Logger logger = LOG;
                        Level level = Level.WARNING;
                        if (logger.isLoggable(level)) {
                            logger.log(level, "PEM object contains whitespaces on -----END line", (Throwable) new Exception("trace"));
                        }
                    }
                    readLine = trim;
                }
                if (readLine.indexOf(m) == 0) {
                    break;
                }
                stringBuffer.append(readLine.trim());
            }
        }
        if (readLine != null) {
            return new PemObject(str, arrayList, Base64.decode(stringBuffer.toString()));
        }
        a$$ExternalSyntheticBUOutline0.m$4(m.concat(" not found"));
        return null;
    }

    public PemObject readPemObject() {
        String readLine;
        String trim;
        int indexOf;
        do {
            readLine = readLine();
            if (readLine == null) {
                break;
            }
        } while (!readLine.startsWith(BEGIN));
        if (readLine == null || (indexOf = (trim = readLine.substring(11).trim()).indexOf(45)) <= 0 || !trim.endsWith("-----") || trim.length() - indexOf != 5) {
            return null;
        }
        return loadObject(trim.substring(0, indexOf));
    }
}
