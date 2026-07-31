package B0;

import F.C0032n;
import a.AbstractC0086a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.datastore.preferences.protobuf.k0;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.crane.slab.beam.R;
import g0.C0131a;
import g0.C0132b;
import h.MenuC0143j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import m.C0199a;
import v0.InterfaceC0239d;

/* renamed from: B0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0000a implements L.f, h.o, InterfaceC0239d {

    /* renamed from: f, reason: collision with root package name */
    public static C0000a f67f;

    /* renamed from: g, reason: collision with root package name */
    public static C0000a f68g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f69e;

    public /* synthetic */ C0000a(int i2) {
        this.f69e = i2;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static F0.i e(List list) {
        F0.i iVar = new F0.i(new F0.f(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((ResolveInfo) it.next()).activityInfo.packageName;
            P0.h.d(str, "packageName");
            iVar.add(str);
        }
        return AbstractC0086a.d(iVar);
    }

    public static N.P f(Context context, String[] strArr, String str, C0032n c0032n) {
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
                            c0032n.g("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                N.P p2 = new N.P(6, false);
                                p2.f698f = zipFile;
                                p2.f699g = entry;
                                return p2;
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

    public static String[] g(Context context, String str) {
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

    public static boolean h(Context context, Uri uri, C0132b c0132b) {
        P0.h.e(context, "context");
        P0.h.e(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW");
        if (c0132b != null) {
            C0131a c0131a = c0132b.f1944k;
            if (P0.h.a((Boolean) c0131a.f1930c, Boolean.TRUE)) {
                Map map = (Map) c0131a.f1933f;
                if (map != null) {
                    intent.putExtra("com.android.browser.headers", k0.d(map));
                }
            } else {
                intent = null;
            }
        }
        if (intent == null) {
            return false;
        }
        intent.setData(uri);
        context.startActivity(intent);
        return true;
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
        switch (this.f69e) {
            case 0:
                try {
                    return (List) new S(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                } catch (IOException | ClassNotFoundException e2) {
                    throw new RuntimeException(e2);
                }
            default:
                P0.h.e(str, "listString");
                Object readObject = new S(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                P0.h.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
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
        switch (this.f69e) {
            case 0:
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
                P0.h.e(list, "list");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                objectOutputStream2.writeObject(list);
                objectOutputStream2.flush();
                String encodeToString = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0);
                P0.h.d(encodeToString, "encodeToString(...)");
                return encodeToString;
        }
    }

    public CharSequence k(Preference preference) {
        switch (this.f69e) {
            case H.k.STRING_FIELD_NUMBER /* 5 */:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                if (TextUtils.isEmpty(null)) {
                    return editTextPreference.f1634e.getString(R.string.not_set);
                }
                return null;
            default:
                ListPreference listPreference = (ListPreference) preference;
                if (TextUtils.isEmpty(null)) {
                    return listPreference.f1634e.getString(R.string.not_set);
                }
                return null;
        }
    }

    @Override // h.o
    public boolean n(MenuC0143j menuC0143j) {
        return false;
    }

    @Override // L.f
    public void o() {
        switch (this.f69e) {
            case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // v0.InterfaceC0239d
    public void p(ByteBuffer byteBuffer, m0.g gVar) {
        v0.p.f3094b.getClass();
        v0.p.c(byteBuffer);
    }

    @Override // L.f
    public void q(int i2, Object obj) {
        String str;
        switch (this.f69e) {
            case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            default:
                switch (i2) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case H.k.LONG_FIELD_NUMBER /* 4 */:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case H.k.STRING_FIELD_NUMBER /* 5 */:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case H.k.BYTES_FIELD_NUMBER /* 8 */:
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
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ C0000a(int i2, Object obj) {
        this.f69e = i2;
    }

    public C0000a() {
        this.f69e = 16;
        new C0199a();
        new m.c();
    }

    private final void i() {
    }

    private final void j(int i2, Object obj) {
    }

    @Override // h.o
    public void a(MenuC0143j menuC0143j, boolean z2) {
    }
}
