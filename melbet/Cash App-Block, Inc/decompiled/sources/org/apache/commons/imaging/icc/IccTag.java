package org.apache.commons.imaging.icc;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Logger;
import org.apache.commons.imaging.common.BinaryFunctions;

/* loaded from: classes9.dex */
public class IccTag {
    private static final Logger LOGGER = Logger.getLogger(IccTag.class.getName());
    private byte[] data;
    private int dataTypeSignature;
    public final IccTagType fIccTagType;
    private IccTagDataType itdt;
    public final int length;
    public final int offset;
    public final int signature;

    public IccTag(int i, int i2, int i3, IccTagType iccTagType) {
        this.signature = i;
        this.offset = i2;
        this.length = i3;
        this.fIccTagType = iccTagType;
    }

    private IccTagDataType getIccTagDataType(int i) {
        for (IccTagDataTypes iccTagDataTypes : IccTagDataTypes.values()) {
            if (iccTagDataTypes.getSignature() == i) {
                return iccTagDataTypes;
            }
        }
        return null;
    }

    public void dump(PrintWriter printWriter, String str) {
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, "tag signature: ");
        m108m.append(Integer.toHexString(this.signature));
        m108m.append(" (");
        int i = this.signature;
        byte[] bArr = {(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
        Charset charset = StandardCharsets.US_ASCII;
        m108m.append(new String(bArr, charset));
        m108m.append(")");
        printWriter.println(m108m.toString());
        if (this.data == null) {
            StringBuilder m108m2 = Recorder$$ExternalSyntheticOutline2.m108m(str, "data: ");
            m108m2.append(Arrays.toString(this.data));
            printWriter.println(m108m2.toString());
        } else {
            StringBuilder m108m3 = Recorder$$ExternalSyntheticOutline2.m108m(str, "data: ");
            m108m3.append(this.data.length);
            printWriter.println(m108m3.toString());
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("data type signature: ");
            sb.append(Integer.toHexString(this.dataTypeSignature));
            sb.append(" (");
            int i2 = this.dataTypeSignature;
            sb.append(new String(new byte[]{(byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255)}, charset));
            sb.append(")");
            printWriter.println(sb.toString());
            if (this.itdt == null) {
                printWriter.println(str + "IccTagType : unknown");
            } else {
                StringBuilder m108m4 = Recorder$$ExternalSyntheticOutline2.m108m(str, "IccTagType : ");
                m108m4.append(this.itdt.getName());
                printWriter.println(m108m4.toString());
                this.itdt.dump(str, this.data);
            }
        }
        printWriter.println("");
        printWriter.flush();
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            int read4Bytes = BinaryFunctions.read4Bytes("data type signature", byteArrayInputStream, "ICC: corrupt tag data", ByteOrder.BIG_ENDIAN);
            this.dataTypeSignature = read4Bytes;
            this.itdt = getIccTagDataType(read4Bytes);
            byteArrayInputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public void dump(String str) {
        StringWriter stringWriter = new StringWriter();
        try {
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                dump(printWriter, str);
                printWriter.flush();
                stringWriter.flush();
                LOGGER.fine(stringWriter.toString());
                printWriter.close();
                stringWriter.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    stringWriter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
