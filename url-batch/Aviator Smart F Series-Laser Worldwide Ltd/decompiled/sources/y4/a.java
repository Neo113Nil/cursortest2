package y4;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.baidu.ar.util.SystemInfoUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.greenrobot.greendao.database.g;
import org.greenrobot.greendao.f;

/* loaded from: classes3.dex */
public final class a {
    public static boolean DEBUG = false;
    private static final String SQLITE_MASTER = "sqlite_master";
    private static final String SQLITE_TEMP_MASTER = "sqlite_temp_master";
    private static String TAG = "MigrationHelper";
    private static WeakReference<InterfaceC0408a> weakListener;

    /* renamed from: y4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0408a {
        void onCreateAllTables(org.greenrobot.greendao.database.a aVar, boolean z7);

        void onDropAllTables(org.greenrobot.greendao.database.a aVar, boolean z7);
    }

    private static void createAllTables(org.greenrobot.greendao.database.a aVar, boolean z7, @NonNull Class<? extends org.greenrobot.greendao.a>... clsArr) {
        reflectMethod(aVar, "createTable", z7, clsArr);
        printLog("【Create all table by reflect】");
    }

    private static void dropAllTables(org.greenrobot.greendao.database.a aVar, boolean z7, @NonNull Class<? extends org.greenrobot.greendao.a>... clsArr) {
        reflectMethod(aVar, "dropTable", z7, clsArr);
        printLog("【Drop all table by reflect】");
    }

    private static void generateTempTables(org.greenrobot.greendao.database.a aVar, Class<? extends org.greenrobot.greendao.a>... clsArr) {
        for (Class<? extends org.greenrobot.greendao.a> cls : clsArr) {
            org.greenrobot.greendao.internal.a aVar2 = new org.greenrobot.greendao.internal.a(aVar, cls);
            String str = aVar2.tablename;
            if (isTableExists(aVar, false, str)) {
                String str2 = null;
                try {
                    str2 = aVar2.tablename.concat("_TEMP");
                    aVar.execSQL("DROP TABLE IF EXISTS " + str2 + ";");
                    aVar.execSQL("CREATE TEMPORARY TABLE " + str2 + " AS SELECT * FROM " + str + ";");
                    StringBuilder sb = new StringBuilder();
                    sb.append("【Table】");
                    sb.append(str);
                    sb.append("\n ---Columns-->");
                    sb.append(getColumnsStr(aVar2));
                    printLog(sb.toString());
                    printLog("【Generate temp table】" + str2);
                } catch (SQLException e8) {
                    Log.e(TAG, "【Failed to generate temp table】" + str2, e8);
                }
            } else {
                printLog("【New Table】" + str);
            }
        }
    }

    private static List<String> getColumns(org.greenrobot.greendao.database.a aVar, String str) {
        Cursor cursor = null;
        r0 = null;
        List<String> asList = null;
        cursor = null;
        try {
            try {
                Cursor rawQuery = aVar.rawQuery("SELECT * FROM " + str + " limit 0", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getColumnCount() > 0) {
                            asList = Arrays.asList(rawQuery.getColumnNames());
                        }
                    } catch (Exception e8) {
                        e = e8;
                        cursor = rawQuery;
                        e.printStackTrace();
                        if (cursor != null) {
                            cursor.close();
                        }
                        return new ArrayList();
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        new ArrayList();
                        throw th;
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return asList == null ? new ArrayList() : asList;
            } catch (Exception e9) {
                e = e9;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String getColumnsStr(org.greenrobot.greendao.internal.a aVar) {
        if (aVar == null) {
            return "no columns";
        }
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        while (true) {
            String[] strArr = aVar.allColumns;
            if (i8 >= strArr.length) {
                break;
            }
            sb.append(strArr[i8]);
            sb.append(SystemInfoUtil.COMMA);
            i8++;
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        r2.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean isTableExists(org.greenrobot.greendao.database.a aVar, boolean z7, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Cursor cursor = null;
        try {
            try {
                cursor = aVar.rawQuery("SELECT COUNT(*) FROM " + (z7 ? SQLITE_TEMP_MASTER : SQLITE_MASTER) + " WHERE type = ? AND name = ?", new String[]{"table", str});
                if (cursor != null && cursor.moveToFirst()) {
                    int i8 = cursor.getInt(0);
                    cursor.close();
                    return i8 > 0;
                }
                return false;
            } catch (Exception e8) {
                e8.printStackTrace();
                if (cursor == null) {
                    return false;
                }
                cursor.close();
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static void migrate(SQLiteDatabase sQLiteDatabase, Class<? extends org.greenrobot.greendao.a>... clsArr) {
        printLog("【The Old Database Version】" + sQLiteDatabase.getVersion());
        migrate(new g(sQLiteDatabase), clsArr);
    }

    private static void printLog(String str) {
        if (DEBUG) {
            Log.d(TAG, str);
        }
    }

    private static void reflectMethod(org.greenrobot.greendao.database.a aVar, String str, boolean z7, @NonNull Class<? extends org.greenrobot.greendao.a>... clsArr) {
        if (clsArr.length < 1) {
            return;
        }
        try {
            for (Class<? extends org.greenrobot.greendao.a> cls : clsArr) {
                cls.getDeclaredMethod(str, org.greenrobot.greendao.database.a.class, Boolean.TYPE).invoke(null, aVar, Boolean.valueOf(z7));
            }
        } catch (IllegalAccessException e8) {
            e8.printStackTrace();
        } catch (NoSuchMethodException e9) {
            e9.printStackTrace();
        } catch (InvocationTargetException e10) {
            e10.printStackTrace();
        }
    }

    private static void restoreData(org.greenrobot.greendao.database.a aVar, Class<? extends org.greenrobot.greendao.a>... clsArr) {
        for (Class<? extends org.greenrobot.greendao.a> cls : clsArr) {
            org.greenrobot.greendao.internal.a aVar2 = new org.greenrobot.greendao.internal.a(aVar, cls);
            String str = aVar2.tablename;
            String concat = str.concat("_TEMP");
            if (isTableExists(aVar, true, concat)) {
                try {
                    List<String> columns = getColumns(aVar, concat);
                    ArrayList arrayList = new ArrayList(columns.size());
                    int i8 = 0;
                    while (true) {
                        f[] fVarArr = aVar2.properties;
                        if (i8 >= fVarArr.length) {
                            break;
                        }
                        String str2 = fVarArr[i8].columnName;
                        if (columns.contains(str2)) {
                            arrayList.add("`" + str2 + "`");
                        }
                        i8++;
                    }
                    if (arrayList.size() > 0) {
                        String join = TextUtils.join(SystemInfoUtil.COMMA, arrayList);
                        aVar.execSQL("REPLACE INTO " + str + " (" + join + ") SELECT " + join + " FROM " + concat + ";");
                        StringBuilder sb = new StringBuilder();
                        sb.append("【Restore data】 to ");
                        sb.append(str);
                        printLog(sb.toString());
                    }
                    aVar.execSQL("DROP TABLE " + concat);
                    printLog("【Drop temp table】" + concat);
                } catch (SQLException e8) {
                    Log.e(TAG, "【Failed to restore data from temp table 】" + concat, e8);
                }
            }
        }
    }

    public static void migrate(SQLiteDatabase sQLiteDatabase, InterfaceC0408a interfaceC0408a, Class<? extends org.greenrobot.greendao.a>... clsArr) {
        weakListener = new WeakReference<>(interfaceC0408a);
        migrate(sQLiteDatabase, clsArr);
    }

    public static void migrate(org.greenrobot.greendao.database.a aVar, InterfaceC0408a interfaceC0408a, Class<? extends org.greenrobot.greendao.a>... clsArr) {
        weakListener = new WeakReference<>(interfaceC0408a);
        migrate(aVar, clsArr);
    }

    public static void migrate(org.greenrobot.greendao.database.a aVar, Class<? extends org.greenrobot.greendao.a>... clsArr) {
        printLog("【Generate temp table】start");
        generateTempTables(aVar, clsArr);
        printLog("【Generate temp table】complete");
        WeakReference<InterfaceC0408a> weakReference = weakListener;
        InterfaceC0408a interfaceC0408a = weakReference != null ? weakReference.get() : null;
        if (interfaceC0408a != null) {
            interfaceC0408a.onDropAllTables(aVar, true);
            printLog("【Drop all table by listener】");
            interfaceC0408a.onCreateAllTables(aVar, false);
            printLog("【Create all table by listener】");
        } else {
            dropAllTables(aVar, true, clsArr);
            createAllTables(aVar, false, clsArr);
        }
        printLog("【Restore data】start");
        restoreData(aVar, clsArr);
        printLog("【Restore data】complete");
    }
}
