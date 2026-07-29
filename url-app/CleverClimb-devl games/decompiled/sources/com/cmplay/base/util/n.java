package com.cmplay.base.util;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: IniResolver.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private Collection<String> f4037a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, a> f4038b = new c();

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        throw new java.lang.Exception("invalid section name");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(Reader reader) {
        char charAt;
        try {
            a();
            BufferedReader bufferedReader = new BufferedReader(reader);
            a aVar = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return true;
                }
                String trim = readLine.trim();
                if (!TextUtils.isEmpty(trim) && (charAt = trim.charAt(0)) != '#' && charAt != ';') {
                    if (charAt != '[') {
                        if (aVar == null) {
                            throw new Exception("not found section name");
                        }
                        int indexOf = trim.indexOf(61);
                        if (indexOf == -1) {
                            throw new Exception("invalid key-value format");
                        }
                        String substring = trim.substring(0, indexOf);
                        String substring2 = trim.substring(indexOf + 1, trim.length());
                        aVar.f4039a.add(substring);
                        aVar.f4040b.put(substring, substring2);
                    } else {
                        if (trim.length() <= 2 || trim.charAt(trim.length() - 1) != ']') {
                            break;
                        }
                        String substring3 = trim.substring(1, trim.length() - 1);
                        if (!this.f4038b.containsKey(substring3)) {
                            aVar = new a();
                            this.f4037a.add(substring3);
                            this.f4038b.put(substring3, aVar);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String a(String str, String str2) {
        a aVar = this.f4038b.get(str);
        if (aVar != null) {
            return aVar.f4040b.get(str2);
        }
        return null;
    }

    public int b(String str, String str2) {
        return a(a(str, str2));
    }

    private int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public void a() {
        this.f4037a.clear();
        this.f4038b.clear();
    }

    /* compiled from: IniResolver.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public Collection<String> f4039a;

        /* renamed from: b, reason: collision with root package name */
        public Map<String, String> f4040b;

        private a() {
            this.f4039a = new LinkedList();
            this.f4040b = new c();
        }
    }
}
