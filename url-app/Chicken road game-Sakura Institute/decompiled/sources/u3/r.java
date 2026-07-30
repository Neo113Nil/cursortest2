package u3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProtocolException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import t3.h0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class r {
    public static final long a(float f9, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
    }

    public static void b(StringBuilder sb, Object obj, q6.c cVar) {
        if (cVar != null) {
            sb.append((CharSequence) cVar.f(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void d(t3.z zVar, String str, o0.a aVar) {
        h0 h0Var = zVar.f8878f;
        h0Var.getClass();
        zVar.f8880h.add(new j((i) h0Var.b(a8.d.H(i.class)), str, aVar).a());
    }

    public static boolean e(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e9) {
                e = e9;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    c(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e10) {
            e = e10;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            c(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            c(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static final int f(Cursor cursor, String str) {
        String str2;
        r6.k.f(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    r6.k.e(columnNames, "columnNames");
                    String concat = ".".concat(str);
                    String str3 = "." + str + '`';
                    int length = columnNames.length;
                    int i7 = 0;
                    int i8 = 0;
                    while (i8 < length) {
                        String str4 = columnNames[i8];
                        int i9 = i7 + 1;
                        if (str4.length() >= str.length() + 2 && (z6.o.o(false, str4, concat) || (str4.charAt(0) == '`' && z6.o.o(false, str4, str3)))) {
                            columnIndex = i7;
                            break;
                        }
                        i8++;
                        i7 = i9;
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            r6.k.e(columnNames2, "c.columnNames");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i10 = 0;
            for (String str5 : columnNames2) {
                i10++;
                if (i10 > 1) {
                    sb.append((CharSequence) ", ");
                }
                b(sb, str5, null);
            }
            sb.append((CharSequence) "");
            str2 = sb.toString();
            r6.k.e(str2, "toString(...)");
        } catch (Exception e9) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e9);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static Object g(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return x2.b.a(bundle, str, e.a.class);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (e.a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final boolean h(long j8) {
        return (j8 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final boolean i(long j8) {
        return (j8 & 9223372034707292159L) == 9205357640488583168L;
    }

    public static y6.g j(q6.e eVar) {
        y6.g gVar = new y6.g();
        gVar.f9911h = a8.m.q(gVar, gVar, eVar);
        return gVar;
    }

    public static MappedByteBuffer k(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static a0.l l(String str) {
        int i7;
        String str2;
        r6.k.f(str, "statusLine");
        boolean v5 = z6.o.v(str, "HTTP/1.");
        s7.q qVar = s7.q.f8662g;
        if (v5) {
            i7 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                qVar = s7.q.f8663h;
            }
        } else {
            if (!z6.o.v(str, "ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i7 = 4;
        }
        int i8 = i7 + 3;
        if (str.length() < i8) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String substring = str.substring(i7, i8);
            r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i8) {
                str2 = "";
            } else {
                if (str.charAt(i8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i7 + 4);
                r6.k.e(str2, "this as java.lang.String).substring(startIndex)");
            }
            return new a0.l(qVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }
}
