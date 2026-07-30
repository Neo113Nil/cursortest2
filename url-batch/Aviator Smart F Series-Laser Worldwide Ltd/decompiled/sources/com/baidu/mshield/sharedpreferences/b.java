package com.baidu.mshield.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.baidu.mshield.utility.g;
import java.util.Set;

/* loaded from: classes2.dex */
public class b implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences.Editor f8381a;

    /* renamed from: b, reason: collision with root package name */
    public Context f8382b;

    /* renamed from: c, reason: collision with root package name */
    public int f8383c;

    /* renamed from: d, reason: collision with root package name */
    public String f8384d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8385e;

    /* renamed from: f, reason: collision with root package name */
    public String f8386f;

    public b(Context context, SharedPreferences.Editor editor, String str, boolean z7, int i8, String str2) {
        this.f8382b = context;
        this.f8381a = editor;
        this.f8383c = i8;
        this.f8384d = str;
        this.f8385e = z7;
        this.f8386f = str2;
    }

    public final Bundle a(Bundle bundle) {
        try {
            com.baidu.mshield.b.c.a.b("SPT callProviderPut:" + bundle);
            bundle.putString("pref_name", this.f8384d);
            return this.f8385e ? TextUtils.isEmpty(this.f8386f) ? g.a(this.f8382b, "CallPreferences", bundle) : g.a(this.f8382b, "CallPreferences", bundle, this.f8386f) : g.a(this.f8382b, "CallPreferences", bundle);
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return null;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
        SharedPreferences.Editor editor;
        if (this.f8383c == 1) {
            if ((!this.f8385e || TextUtils.isEmpty(this.f8386f)) && (editor = this.f8381a) != null) {
                editor.apply();
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor clear() {
        throw new RuntimeException("This editor not allow to call clear.");
    }

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
        SharedPreferences.Editor editor;
        if (this.f8383c != 1 || ((this.f8385e && !TextUtils.isEmpty(this.f8386f)) || (editor = this.f8381a) == null)) {
            return true;
        }
        return editor.commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putBoolean(String str, boolean z7) {
        try {
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
        if (this.f8383c != 1 || (this.f8385e && !TextUtils.isEmpty(this.f8386f))) {
            Bundle bundle = new Bundle();
            bundle.putString("operation", "putBoolean");
            bundle.putString("key", str);
            bundle.putBoolean("value", z7);
            a(bundle);
            return this;
        }
        if (this.f8381a == null) {
            return this;
        }
        com.baidu.mshield.b.c.a.b("SPT putBoolean:put by mBase");
        SharedPreferences.Editor editor = this.f8381a;
        if (editor != null) {
            editor.putBoolean(str, z7);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putFloat(String str, float f8) {
        try {
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
        if (this.f8383c != 1 || (this.f8385e && !TextUtils.isEmpty(this.f8386f))) {
            Bundle bundle = new Bundle();
            bundle.putString("operation", "putFloat");
            bundle.putString("key", str);
            bundle.putFloat("value", f8);
            a(bundle);
            return this;
        }
        if (this.f8381a == null) {
            return this;
        }
        com.baidu.mshield.b.c.a.b("SPT putFloat:put by mBase");
        SharedPreferences.Editor editor = this.f8381a;
        if (editor != null) {
            editor.putFloat(str, f8);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putInt(String str, int i8) {
        try {
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
        if (this.f8383c != 1 || (this.f8385e && !TextUtils.isEmpty(this.f8386f))) {
            Bundle bundle = new Bundle();
            bundle.putString("operation", "putInt");
            bundle.putString("key", str);
            bundle.putInt("value", i8);
            a(bundle);
            return this;
        }
        if (this.f8381a == null) {
            return this;
        }
        com.baidu.mshield.b.c.a.b("SPT putInt:put by mBase");
        SharedPreferences.Editor editor = this.f8381a;
        if (editor != null) {
            editor.putInt(str, i8);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putLong(String str, long j8) {
        try {
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
        if (this.f8383c != 1 || (this.f8385e && !TextUtils.isEmpty(this.f8386f))) {
            Bundle bundle = new Bundle();
            bundle.putString("operation", "putLong");
            bundle.putString("key", str);
            bundle.putLong("value", j8);
            a(bundle);
            return this;
        }
        if (this.f8381a == null) {
            return this;
        }
        com.baidu.mshield.b.c.a.b("SPT putLong:put by mBase");
        SharedPreferences.Editor editor = this.f8381a;
        if (editor != null) {
            editor.putLong(str, j8);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putString(String str, String str2) {
        try {
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
        if (this.f8383c != 1 || (this.f8385e && !TextUtils.isEmpty(this.f8386f))) {
            Bundle bundle = new Bundle();
            bundle.putString("operation", "putString");
            bundle.putString("key", str);
            bundle.putString("value", str2);
            a(bundle);
            return this;
        }
        if (this.f8381a == null) {
            return this;
        }
        com.baidu.mshield.b.c.a.b("SPT putString:put by mBase");
        SharedPreferences.Editor editor = this.f8381a;
        if (editor != null) {
            editor.putString(str, str2);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        throw new RuntimeException("This editor not allow to call putStringSet.");
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor remove(String str) {
        throw new RuntimeException("This editor not allow to call remove.");
    }
}
