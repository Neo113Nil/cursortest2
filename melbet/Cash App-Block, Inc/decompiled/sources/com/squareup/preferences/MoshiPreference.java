package com.squareup.preferences;

import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;

/* loaded from: classes.dex */
public final class MoshiPreference {
    public final Moshi moshi;
    public final SharedPreferences preferences;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SyntaxExceptionBehavior {
        public static final /* synthetic */ SyntaxExceptionBehavior[] $VALUES = {new SyntaxExceptionBehavior("DELETE", 0), new SyntaxExceptionBehavior("NULL", 1), new SyntaxExceptionBehavior("THROW", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        SyntaxExceptionBehavior EF5;

        public static SyntaxExceptionBehavior valueOf(String str) {
            return (SyntaxExceptionBehavior) Enum.valueOf(SyntaxExceptionBehavior.class, str);
        }

        public static SyntaxExceptionBehavior[] values() {
            return (SyntaxExceptionBehavior[]) $VALUES.clone();
        }
    }

    public MoshiPreference(SharedPreferences sharedPreferences, Moshi moshi) {
        SyntaxExceptionBehavior[] syntaxExceptionBehaviorArr = SyntaxExceptionBehavior.$VALUES;
        this.preferences = sharedPreferences;
        this.moshi = moshi;
    }

    public final void delete() {
        this.preferences.edit().remove("update-required").apply();
    }
}
