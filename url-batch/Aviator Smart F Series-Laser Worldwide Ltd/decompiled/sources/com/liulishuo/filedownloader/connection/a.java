package com.liulishuo.filedownloader.connection;

import com.liulishuo.filedownloader.util.c;

/* loaded from: classes4.dex */
public class a implements c.a {
    private static final long FOUR_CONNECTION_UPPER_LIMIT = 104857600;
    private static final long ONE_CONNECTION_UPPER_LIMIT = 1048576;
    private static final long THREE_CONNECTION_UPPER_LIMIT = 52428800;
    private static final long TWO_CONNECTION_UPPER_LIMIT = 5242880;

    @Override // com.liulishuo.filedownloader.util.c.a
    public int determineConnectionCount(int i8, String str, String str2, long j8) {
        if (j8 < 1048576) {
            return 1;
        }
        if (j8 < 5242880) {
            return 2;
        }
        if (j8 < THREE_CONNECTION_UPPER_LIMIT) {
            return 3;
        }
        return j8 < FOUR_CONNECTION_UPPER_LIMIT ? 4 : 5;
    }
}
