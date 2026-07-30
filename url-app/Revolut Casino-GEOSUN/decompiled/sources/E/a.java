package E;

import A.j;
import D.C0013n;
import F0.i;
import J.e;
import L.C0026b;
import L.Q;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.aurifaber.valuta.rotatus.signum.modulus.R;
import e0.C0114b;
import g.o;
import g.t;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import k.C0179a;
import k.c;
import m0.C0201k;
import n0.k;
import s0.M;

/* loaded from: classes.dex */
public final class a implements e, o, k {

    /* renamed from: f, reason: collision with root package name */
    public static a f290f;

    /* renamed from: g, reason: collision with root package name */
    public static a f291g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f292e;

    public /* synthetic */ a(int i2) {
        this.f292e = i2;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static Q e(Context context, String[] strArr, String str, C0013n c0013n) {
        String[] l2 = l(context);
        int length = l2.length;
        int i2 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i2 >= length) {
                return null;
            }
            String str2 = l2[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i3 = i4;
                }
            }
            if (zipFile != null) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c2 = File.separatorChar;
                            sb.append(c2);
                            sb.append(str3);
                            sb.append(c2);
                            sb.append(str);
                            String sb2 = sb.toString();
                            c0013n.g("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                Q q2 = new Q(6, false);
                                q2.f515f = zipFile;
                                q2.f516g = entry;
                                return q2;
                            }
                        }
                        i5 = i6;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i2++;
        }
    }

    public static String[] f(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c2 = File.separatorChar;
        sb.append(c2);
        sb.append("([^\\");
        sb.append(c2);
        sb.append("]*)");
        sb.append(c2);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : l(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] l(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    public List c(String str) {
        switch (this.f292e) {
            case 24:
                try {
                    return (List) new M(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                } catch (IOException | ClassNotFoundException e2) {
                    throw new RuntimeException(e2);
                }
            default:
                i.e(str, "listString");
                Object readObject = new M(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                i.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) readObject) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
        }
    }

    public String d(List list) {
        switch (this.f292e) {
            case 24:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(list);
                    objectOutputStream.flush();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            default:
                i.e(list, "list");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                objectOutputStream2.writeObject(list);
                objectOutputStream2.flush();
                String encodeToString = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0);
                i.d(encodeToString, "encodeToString(...)");
                return encodeToString;
        }
    }

    @Override // J.e
    public void g(int i2, Serializable serializable) {
        String str;
        switch (this.f292e) {
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            default:
                switch (i2) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case F.k.LONG_FIELD_NUMBER /* 4 */:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case F.k.STRING_FIELD_NUMBER /* 5 */:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case F.k.BYTES_FIELD_NUMBER /* 8 */:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i2 != 6 && i2 != 7 && i2 != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    break;
                }
                break;
        }
    }

    @Override // J.e
    public void h() {
        switch (this.f292e) {
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public CharSequence k(Preference preference) {
        switch (this.f292e) {
            case 1:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                editTextPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return editTextPreference.f1544e.getString(R.string.not_set);
                }
                return null;
            default:
                ListPreference listPreference = (ListPreference) preference;
                listPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return listPreference.f1544e.getString(R.string.not_set);
                }
                return null;
        }
    }

    @Override // g.o
    public boolean m(t tVar) {
        return false;
    }

    @Override // n0.k
    public void n(Q q2, C0201k c0201k) {
        switch (this.f292e) {
            case 20:
                c0201k.c(null);
                break;
            default:
                c0201k.c(null);
                break;
        }
    }

    public /* synthetic */ a(int i2, Object obj) {
        this.f292e = i2;
    }

    public a() {
        this.f292e = 12;
        new C0179a();
        new c();
    }

    public a(C0114b c0114b) {
        this.f292e = 21;
        new C0026b(c0114b, "flutter/deferredcomponent", n0.o.f2789a, 8).J(new j(29, this));
        C0026b.C().getClass();
        new HashMap();
    }

    private final void i() {
    }

    private final void j(int i2, Serializable serializable) {
    }

    @Override // g.o
    public void a(g.j jVar, boolean z2) {
    }
}
