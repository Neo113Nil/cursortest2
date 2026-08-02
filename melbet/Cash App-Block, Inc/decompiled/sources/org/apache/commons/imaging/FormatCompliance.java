package org.apache.commons.imaging;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public class FormatCompliance {
    private static final Logger LOGGER = Logger.getLogger(FormatCompliance.class.getName());
    private final List<String> comments;
    private final String description;
    private final boolean failOnError;

    public FormatCompliance(String str) {
        this.comments = new ArrayList();
        this.description = str;
        this.failOnError = false;
    }

    public static FormatCompliance getDefault() {
        return new FormatCompliance("ignore", false);
    }

    private String getValueDescription(int i) {
        return i + " (" + Integer.toHexString(i) + ")";
    }

    public void addComment(String str, int i) {
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, ": ");
        m108m.append(getValueDescription(i));
        addComment(m108m.toString());
    }

    public boolean checkBounds(String str, int i, int i2, int i3) {
        if (i3 >= i && i3 <= i2) {
            return true;
        }
        addComment(str + ": bounds check: " + i + " <= " + i3 + " <= " + i2 + ": false");
        return false;
    }

    public boolean compare(String str, int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append(str);
        sb.append(": Unexpected value: (valid: ");
        if (iArr.length > 1) {
            sb.append('{');
        }
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(getValueDescription(iArr[i3]));
        }
        if (iArr.length > 1) {
            sb.append('}');
        }
        sb.append(", actual: ");
        sb.append(getValueDescription(i));
        sb.append(")");
        addComment(sb.toString());
        return false;
    }

    public boolean compareBytes(String str, byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, ": Unexpected length: (expected: ");
            m108m.append(bArr.length);
            m108m.append(", actual: ");
            m108m.append(bArr2.length);
            m108m.append(")");
            addComment(m108m.toString());
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                StringBuilder m108m2 = Recorder$$ExternalSyntheticOutline2.m108m(str, ": Unexpected value: (expected: ");
                m108m2.append(getValueDescription(bArr[i]));
                m108m2.append(", actual: ");
                m108m2.append(getValueDescription(bArr2[i]));
                m108m2.append(")");
                addComment(m108m2.toString());
                return false;
            }
        }
        return true;
    }

    public void dump(PrintWriter printWriter) {
        printWriter.println("Format Compliance: " + this.description);
        if (this.comments.isEmpty()) {
            printWriter.println("\tNo comments.");
        } else {
            int i = 0;
            while (i < this.comments.size()) {
                StringBuilder sb = new StringBuilder("\t");
                int i2 = i + 1;
                sb.append(i2);
                sb.append(": ");
                sb.append(this.comments.get(i));
                printWriter.println(sb.toString());
                i = i2;
            }
        }
        printWriter.println("");
        printWriter.flush();
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        dump(new PrintWriter(stringWriter));
        return stringWriter.getBuffer().toString();
    }

    public FormatCompliance(String str, boolean z) {
        this.comments = new ArrayList();
        this.description = str;
        this.failOnError = z;
    }

    public void addComment(String str) {
        this.comments.add(str);
        if (this.failOnError) {
            f$$ExternalSyntheticLambda0.m(str);
        }
    }

    public void dump() {
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    dump(printWriter);
                    printWriter.flush();
                    stringWriter.flush();
                    LOGGER.fine(stringWriter.toString());
                    printWriter.close();
                    stringWriter.close();
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), (Throwable) e);
        }
    }

    public boolean compare(String str, int i, int i2) {
        return compare(str, new int[]{i}, i2);
    }
}
