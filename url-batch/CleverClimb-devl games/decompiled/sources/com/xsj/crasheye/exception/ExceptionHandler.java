package com.xsj.crasheye.exception;

import com.xsj.crasheye.ActionError;
import com.xsj.crasheye.ActionTransactionStop;
import com.xsj.crasheye.AsyncDataSaver;
import com.xsj.crasheye.Crasheye;
import com.xsj.crasheye.EnumActionType;
import com.xsj.crasheye.EnumExceptionType;
import com.xsj.crasheye.Properties;
import com.xsj.crasheye.TransactionsDatabase;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler defaultExceptionHandler;

    public ExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.defaultExceptionHandler = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            th2.printStackTrace(printWriter);
        }
        ActionError actionError = new ActionError(EnumActionType.error, stringWriter.toString(), EnumExceptionType.UNHANDLED, null);
        Iterator<Map.Entry<String, TransactionsDatabase.Container>> it = Properties.transactionsDatabase.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, TransactionsDatabase.Container> next = it.next();
            if (next.getValue() != null) {
                ActionTransactionStop.createTransactionFail(next.getKey().replace("TStart:name:", ""), actionError.getErrorHash(), null).save(new AsyncDataSaver());
            }
            it.remove();
        }
        actionError.save(null);
        if (Crasheye.crasheyeCallback != null) {
            Crasheye.crasheyeCallback.lastBreath(new Exception(th));
        }
        this.defaultExceptionHandler.uncaughtException(thread, th);
    }
}
