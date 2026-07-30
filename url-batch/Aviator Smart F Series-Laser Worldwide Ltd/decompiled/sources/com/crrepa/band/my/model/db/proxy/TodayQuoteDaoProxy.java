package com.crrepa.band.my.model.db.proxy;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.TodayQuote;
import com.crrepa.band.my.model.db.greendao.TodayQuoteDao;
import com.moyoung.dafit.module.common.utils.s;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/* loaded from: classes2.dex */
public class TodayQuoteDaoProxy {
    private static final long DEFAULT_ID = 1;
    private TodayQuoteDao dao = c.getInstance().getDaoSession().getTodayQuoteDao();

    private TodayQuote getDefault(List<Integer> list) {
        TodayQuote todayQuote = new TodayQuote();
        todayQuote.setId(1L);
        todayQuote.setDate(new Date());
        todayQuote.setQueue(s.bean2Json(list));
        return todayQuote;
    }

    @NonNull
    private static List<Integer> getQuoteQueue(int i8) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < i8; i9++) {
            arrayList.add(Integer.valueOf(i9));
        }
        ArrayList arrayList2 = new ArrayList();
        Random random = new Random();
        for (int i10 = 0; i10 < i8; i10++) {
            arrayList2.add((Integer) arrayList.remove(random.nextInt(arrayList.size())));
        }
        return arrayList2;
    }

    public String getTodayQuote(Context context) {
        TodayQuote todayQuote;
        int intValue;
        int i8;
        TodayQuote todayQuote2;
        String[] stringArray = context.getResources().getStringArray(R.array.day_quote_array);
        if (stringArray == null || stringArray.length < 1) {
            return null;
        }
        List<Object> list = this.dao.queryBuilder().orderAsc(TodayQuoteDao.Properties.Id).list();
        if (list == null || list.isEmpty()) {
            List<Integer> quoteQueue = getQuoteQueue(stringArray.length);
            todayQuote = getDefault(quoteQueue);
            intValue = quoteQueue.get(0).intValue();
        } else {
            todayQuote2 = (TodayQuote) list.get(0);
            String queue = todayQuote2.getQueue();
            if (!TextUtils.isEmpty(queue)) {
                List json2List = s.json2List(queue, Integer[].class);
                if (json2List == null || json2List.isEmpty()) {
                    i8 = new Random().nextInt(stringArray.length);
                } else {
                    if (!DateUtils.isToday(todayQuote2.getDate().getTime())) {
                        json2List.remove(0);
                    }
                    int intValue2 = ((Integer) json2List.get(0)).intValue();
                    todayQuote2.setQueue(s.bean2Json(json2List));
                    i8 = intValue2;
                }
                todayQuote2.setDate(new Date());
                this.dao.insertOrReplace(todayQuote2);
                return stringArray[i8 % stringArray.length];
            }
            List<Integer> quoteQueue2 = getQuoteQueue(stringArray.length);
            todayQuote = getDefault(quoteQueue2);
            intValue = quoteQueue2.get(0).intValue();
        }
        TodayQuote todayQuote3 = todayQuote;
        i8 = intValue;
        todayQuote2 = todayQuote3;
        todayQuote2.setDate(new Date());
        this.dao.insertOrReplace(todayQuote2);
        return stringArray[i8 % stringArray.length];
    }
}
