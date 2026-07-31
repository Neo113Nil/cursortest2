package com.yandex.div.storage.database;

import W1.f;
import android.database.SQLException;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.DivStorageErrorException;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.util.SqlExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class StorageStatementExecutor {

    @NotNull
    private final Function0<DatabaseOpenHelper.Database> dbProvider;

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivDataRepository.ActionOnError.values().length];
            try {
                iArr[DivDataRepository.ActionOnError.ABORT_TRANSACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivDataRepository.ActionOnError.SKIP_ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StorageStatementExecutor(@NotNull Function0<? extends DatabaseOpenHelper.Database> dbProvider) {
        Intrinsics.checkNotNullParameter(dbProvider, "dbProvider");
        this.dbProvider = dbProvider;
    }

    private static final void execute$executeCatchingSqlException(G g4, E e4, StorageStatement[] storageStatementArr, DivDataRepository.ActionOnError actionOnError, StorageStatementExecutor storageStatementExecutor, List<DivStorageErrorException> list, ClosableSqlCompiler closableSqlCompiler, StorageStatement storageStatement) {
        try {
            storageStatement.execute(closableSqlCompiler);
        } catch (SQLException e5) {
            execute$handleException(g4, e4, storageStatementArr, actionOnError, storageStatementExecutor, list, e5);
        } catch (IllegalStateException e6) {
            execute$handleException(g4, e4, storageStatementArr, actionOnError, storageStatementExecutor, list, e6);
        }
    }

    private static final void execute$handleException(G g4, E e4, StorageStatement[] storageStatementArr, DivDataRepository.ActionOnError actionOnError, StorageStatementExecutor storageStatementExecutor, List<DivStorageErrorException> list, Exception exc) {
        String str = "Exception at statement '" + g4.f41132b + "' (" + e4.f41130b + " out " + storageStatementArr.length + ')';
        int i4 = WhenMappings.$EnumSwitchMapping$0[actionOnError.ordinal()];
        if (i4 == 1) {
            storageStatementExecutor.throwWithLogging(str, exc);
            throw new f();
        }
        if (i4 != 2) {
            return;
        }
        list.add(new DivStorageErrorException(str, exc, null, 4, null));
    }

    private final Void throwWithLogging(String str, Exception exc) {
        throw new SQLException(str, exc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        if (r3 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        com.yandex.div.storage.util.SqlExtensionsKt.closeSilently(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009e, code lost:
    
        if (r3 != null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExecutionResult execute(@NotNull DivDataRepository.ActionOnError actionOnError, @NotNull StorageStatement... statements) {
        Throwable th;
        ClosableSqlCompiler closableSqlCompiler;
        IllegalStateException illegalStateException;
        ClosableSqlCompiler closableSqlCompiler2;
        String str;
        SQLException sQLException;
        SQLException sQLException2;
        ClosableSqlCompiler closableSqlCompiler3;
        Intrinsics.checkNotNullParameter(actionOnError, "actionOnError");
        Intrinsics.checkNotNullParameter(statements, "statements");
        E e4 = new E();
        e4.f41130b = 1;
        G g4 = new G();
        ArrayList arrayList = new ArrayList();
        DatabaseOpenHelper.Database database = null;
        try {
            try {
            } catch (SQLException e5) {
                str = "Error during statements execution.";
                sQLException = e5;
            }
            try {
                DatabaseOpenHelper.Database database2 = (DatabaseOpenHelper.Database) this.dbProvider.invoke();
                try {
                    closableSqlCompiler = new ClosableSqlCompiler(database2);
                    try {
                        database2.beginTransaction();
                        int length = statements.length;
                        int i4 = 0;
                        while (i4 < length) {
                            StorageStatement storageStatement = statements[i4];
                            g4.f41132b = storageStatement;
                            DivDataRepository.ActionOnError actionOnError2 = actionOnError;
                            StorageStatement[] storageStatementArr = statements;
                            execute$executeCatchingSqlException(g4, e4, storageStatementArr, actionOnError2, this, arrayList, closableSqlCompiler, storageStatement);
                            e4.f41130b++;
                            i4++;
                            statements = storageStatementArr;
                            actionOnError = actionOnError2;
                        }
                        database2.setTransactionSuccessful();
                        SqlExtensionsKt.endTransactionSilently(database2);
                        closableSqlCompiler.close();
                        SqlExtensionsKt.closeSilently(database2);
                    } catch (SQLException e6) {
                        str = "Error during statements execution.";
                        database = database2;
                        sQLException2 = e6;
                        closableSqlCompiler3 = closableSqlCompiler;
                        try {
                            arrayList.add(new DivStorageErrorException(str, sQLException2, null, 4, null));
                            if (database != null) {
                            }
                            if (closableSqlCompiler3 != null) {
                            }
                        } catch (Throwable th2) {
                            closableSqlCompiler = closableSqlCompiler3;
                            th = th2;
                            if (database != null) {
                            }
                            if (closableSqlCompiler != null) {
                            }
                            if (database == null) {
                            }
                        }
                    } catch (IllegalStateException e7) {
                        illegalStateException = e7;
                        closableSqlCompiler2 = closableSqlCompiler;
                        database = database2;
                        try {
                            arrayList.add(new DivStorageErrorException("Error during statements execution.", illegalStateException, null, 4, null));
                            if (database != null) {
                                SqlExtensionsKt.endTransactionSilently(database);
                            }
                            if (closableSqlCompiler2 != null) {
                                closableSqlCompiler2.close();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            closableSqlCompiler = closableSqlCompiler2;
                            if (database != null) {
                                SqlExtensionsKt.endTransactionSilently(database);
                            }
                            if (closableSqlCompiler != null) {
                                closableSqlCompiler.close();
                            }
                            if (database == null) {
                                throw th;
                            }
                            SqlExtensionsKt.closeSilently(database);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        database = database2;
                        if (database != null) {
                        }
                        if (closableSqlCompiler != null) {
                        }
                        if (database == null) {
                        }
                    }
                } catch (SQLException e8) {
                    str = "Error during statements execution.";
                    sQLException2 = e8;
                    closableSqlCompiler3 = null;
                    database = database2;
                } catch (IllegalStateException e9) {
                    illegalStateException = e9;
                    closableSqlCompiler2 = null;
                } catch (Throwable th5) {
                    th = th5;
                    closableSqlCompiler = null;
                }
            } catch (SQLException e10) {
                sQLException = e10;
                str = "Error during statements execution.";
                sQLException2 = sQLException;
                closableSqlCompiler3 = null;
                arrayList.add(new DivStorageErrorException(str, sQLException2, null, 4, null));
                if (database != null) {
                    SqlExtensionsKt.endTransactionSilently(database);
                }
                if (closableSqlCompiler3 != null) {
                    closableSqlCompiler3.close();
                }
            }
        } catch (IllegalStateException e11) {
            illegalStateException = e11;
            closableSqlCompiler2 = null;
        } catch (Throwable th6) {
            th = th6;
            closableSqlCompiler = null;
        }
        return new ExecutionResult(arrayList);
    }

    @NotNull
    public final ExecutionResult execute(@NotNull StorageStatement... statements) {
        Intrinsics.checkNotNullParameter(statements, "statements");
        return execute(DivDataRepository.ActionOnError.ABORT_TRANSACTION, (StorageStatement[]) Arrays.copyOf(statements, statements.length));
    }
}
