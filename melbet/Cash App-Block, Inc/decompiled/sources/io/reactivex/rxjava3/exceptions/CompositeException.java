package io.reactivex.rxjava3.exceptions;

import android.opengl.GLES20;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.primitives.Ints$IntArrayAsList;
import com.google.common.primitives.Longs;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class CompositeException extends RuntimeException {
    public Throwable cause;
    public final List exceptions;
    public final String message;

    public static final class ExceptionOverview extends RuntimeException {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public final class WrappedPrintStream {
        public final /* synthetic */ int $r8$classId;
        public final Object printStream;

        public /* synthetic */ WrappedPrintStream(Object obj, int i) {
            this.$r8$classId = i;
            this.printStream = obj;
        }

        public static List asList(int... iArr) {
            return iArr.length == 0 ? Collections.EMPTY_LIST : new Ints$IntArrayAsList(0, iArr.length, iArr);
        }

        public static final void checkFramebufferStatus() {
            String str;
            int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
            if (glCheckFramebufferStatus != 36053) {
                switch (glCheckFramebufferStatus) {
                    case 36054:
                        str = "INCOMPLETE_ATTACHMENT";
                        break;
                    case 36055:
                        str = "MISSING_ATTACHMENT";
                        break;
                    case 36057:
                        str = "INCOMPLETE_DIMENSIONS";
                        break;
                    case 36061:
                        str = "UNSUPPORTED";
                        break;
                    default:
                        str = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(glCheckFramebufferStatus, "UNKNOWN(", ")");
                        break;
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1("Framebuffer incomplete: ".concat(str));
            }
        }

        public static final void checkGlError(String str) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                return;
            }
            OptionalProvider$$ExternalSyntheticLambda0.m$1(Recorder$$ExternalSyntheticOutline2.m(str, " : glError 0x", Integer.toHexString(glGetError)));
        }

        public static int checkedCast(long j) {
            int i = (int) j;
            Trace.checkArgument(j, "Out of range: %s", ((long) i) == j);
            return i;
        }

        public static int fromByteArray(byte[] bArr) {
            Trace.checkArgument(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3]);
        }

        public static int fromBytes(byte b, byte b2, byte b3, byte b4) {
            return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
        }

        public static final int loadShader(int i, String str) {
            str.getClass();
            int glCreateShader = GLES20.glCreateShader(i);
            checkGlError("glCreateShader type=" + i);
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            GLES20.glDeleteShader(glCreateShader);
            OptionalProvider$$ExternalSyntheticLambda0.m$1(Recorder$$ExternalSyntheticOutline2.m("Could not compile shader: ", glGetShaderInfoLog));
            return 0;
        }

        public static int saturatedCast(long j) {
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return j < -2147483648L ? PKIFailureInfo.systemUnavail : (int) j;
        }

        public static int[] toArray(Collection collection) {
            if (collection instanceof Ints$IntArrayAsList) {
                Ints$IntArrayAsList ints$IntArrayAsList = (Ints$IntArrayAsList) collection;
                return Arrays.copyOfRange(ints$IntArrayAsList.f1001array, ints$IntArrayAsList.start, ints$IntArrayAsList.end);
            }
            Object[] array2 = collection.toArray();
            int length = array2.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                Object obj = array2[i];
                obj.getClass();
                iArr[i] = ((Number) obj).intValue();
            }
            return iArr;
        }

        public static Integer tryParse(String str) {
            byte b;
            Long valueOf;
            byte b2;
            str.getClass();
            if (!str.isEmpty()) {
                int i = str.charAt(0) == '-' ? 1 : 0;
                if (i != str.length()) {
                    int i2 = i + 1;
                    char charAt = str.charAt(i);
                    if (charAt < 128) {
                        b = Longs.AsciiDigits.asciiDigits[charAt];
                    } else {
                        byte[] bArr = Longs.AsciiDigits.asciiDigits;
                        b = -1;
                    }
                    if (b >= 0 && b < 10) {
                        long j = -b;
                        while (true) {
                            if (i2 < str.length()) {
                                int i3 = i2 + 1;
                                char charAt2 = str.charAt(i2);
                                if (charAt2 < 128) {
                                    b2 = Longs.AsciiDigits.asciiDigits[charAt2];
                                } else {
                                    byte[] bArr2 = Longs.AsciiDigits.asciiDigits;
                                    b2 = -1;
                                }
                                if (b2 < 0 || b2 >= 10 || j < -922337203685477580L) {
                                    break;
                                }
                                long j2 = j * 10;
                                long j3 = b2;
                                if (j2 < Long.MIN_VALUE + j3) {
                                    break;
                                }
                                j = j2 - j3;
                                i2 = i3;
                            } else if (i != 0) {
                                valueOf = Long.valueOf(j);
                            } else if (j != Long.MIN_VALUE) {
                                valueOf = Long.valueOf(-j);
                            }
                        }
                    }
                }
            }
            valueOf = null;
            if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
                return null;
            }
            return Integer.valueOf(valueOf.intValue());
        }

        public final WrappedPrintStream append(Serializable serializable) {
            switch (this.$r8$classId) {
                case 0:
                    ((PrintStream) this.printStream).print(serializable);
                    break;
                default:
                    ((PrintWriter) this.printStream).print(serializable);
                    break;
            }
            return this;
        }
    }

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).exceptions);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("errors is empty");
            throw null;
        }
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
        this.exceptions = unmodifiableList;
        this.message = unmodifiableList.size() + " exceptions occurred. ";
    }

    public static void appendStackTrace(WrappedPrintStream wrappedPrintStream, Throwable th, String str) {
        wrappedPrintStream.append(str).append(th).append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            wrappedPrintStream.append("\t\tat ").append(stackTraceElement).append('\n');
        }
        if (th.getCause() != null) {
            wrappedPrintStream.append("\tCaused by: ");
            appendStackTrace(wrappedPrintStream, th.getCause(), "");
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        int i;
        try {
            if (this.cause == null) {
                String property = System.getProperty("line.separator");
                if (this.exceptions.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Multiple exceptions (");
                    sb.append(this.exceptions.size());
                    sb.append(")");
                    sb.append(property);
                    for (Throwable th : this.exceptions) {
                        int i2 = 0;
                        while (true) {
                            if (th != null) {
                                for (int i3 = 0; i3 < i2; i3++) {
                                    sb.append("  ");
                                }
                                sb.append("|-- ");
                                sb.append(th.getClass().getCanonicalName());
                                sb.append(": ");
                                String message = th.getMessage();
                                if (message == null || !message.contains(property)) {
                                    sb.append(message);
                                    sb.append(property);
                                } else {
                                    sb.append(property);
                                    for (String str : message.split(property)) {
                                        for (int i4 = 0; i4 < i2 + 2; i4++) {
                                            sb.append("  ");
                                        }
                                        sb.append(str);
                                        sb.append(property);
                                    }
                                }
                                int i5 = 0;
                                while (true) {
                                    i = i2 + 2;
                                    if (i5 >= i) {
                                        break;
                                    }
                                    sb.append("  ");
                                    i5++;
                                }
                                StackTraceElement[] stackTrace = th.getStackTrace();
                                if (stackTrace.length > 0) {
                                    sb.append("at ");
                                    sb.append(stackTrace[0]);
                                    sb.append(property);
                                }
                                if (identityHashMap.containsKey(th)) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        for (int i6 = 0; i6 < i; i6++) {
                                            sb.append("  ");
                                        }
                                        sb.append("|-- ");
                                        sb.append("(cause not expanded again) ");
                                        sb.append(cause.getClass().getCanonicalName());
                                        sb.append(": ");
                                        sb.append(cause.getMessage());
                                        sb.append(property);
                                    }
                                } else {
                                    identityHashMap.put(th, Boolean.TRUE);
                                    th = th.getCause();
                                    i2++;
                                }
                            }
                        }
                    }
                    this.cause = new ExceptionOverview(sb.toString().trim());
                } else {
                    this.cause = (Throwable) this.exceptions.get(0);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.cause;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public final void printStackTrace(WrappedPrintStream wrappedPrintStream) {
        wrappedPrintStream.append(this).append("\n");
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            wrappedPrintStream.append("\tat ").append(stackTraceElement).append("\n");
        }
        int i = 1;
        for (Throwable th : this.exceptions) {
            wrappedPrintStream.append("  ComposedException ").append(Integer.valueOf(i)).append(" :\n");
            appendStackTrace(wrappedPrintStream, th, "\t");
            i++;
        }
        wrappedPrintStream.append("\n");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        printStackTrace(new WrappedPrintStream(printStream, 0));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        printStackTrace(new WrappedPrintStream(printWriter, 1));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }
}
