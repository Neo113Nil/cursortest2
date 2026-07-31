package androidx.sqlite.db;

import java.util.regex.Pattern;
import kotlin.Metadata;

/* compiled from: SupportSQLiteQueryBuilder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "", "Companion", "sqlite_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public final class SupportSQLiteQueryBuilder {
    private static final Pattern limitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
}
