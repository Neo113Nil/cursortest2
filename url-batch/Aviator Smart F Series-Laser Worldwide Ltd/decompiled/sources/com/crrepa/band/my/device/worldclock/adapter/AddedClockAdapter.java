package com.crrepa.band.my.device.worldclock.adapter;

import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import androidx.annotation.NonNull;
import cn.hutool.core.text.l;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.worldclock.model.WorldClockConvert;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.crrepa.band.my.model.db.WorldClock;
import com.moyoung.dafit.module.common.utils.t;
import e2.b;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class AddedClockAdapter extends BaseQuickAdapter<WorldClock, BaseViewHolder> {
    public AddedClockAdapter() {
        super(R.layout.item_world_clock);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0050, code lost:
    
        if (r0 > r4) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getDayString(WorldClock worldClock) {
        Calendar calendar = Calendar.getInstance();
        int i8 = calendar.get(2);
        int i9 = calendar.get(5);
        calendar.setTimeInMillis(WorldClockConvert.getOffsetTimeInMillis(worldClock.getTimeZone().intValue()));
        int i10 = calendar.get(2);
        int i11 = calendar.get(5);
        String string = getContext().getString(R.string.world_clock_today);
        String string2 = getContext().getString(R.string.world_clock_yesterday);
        String string3 = getContext().getString(R.string.world_clock_tomorrow);
        if (i10 >= i8) {
            if (i10 <= i8) {
                if (i11 >= i9) {
                }
            }
            string = string3;
            return string + l.SPACE + getOffsetTimeFormatString(worldClock);
        }
        string = string2;
        return string + l.SPACE + getOffsetTimeFormatString(worldClock);
    }

    private String getOffsetTimeFormatString(WorldClock worldClock) {
        int intValue = worldClock.getJetLag().intValue();
        int i8 = intValue / 60;
        int i9 = i8 / 60;
        int i10 = i8 % 60;
        if (i10 == 59) {
            i9++;
            i10 = 0;
        }
        if (i10 == 0) {
            if (i9 < 0) {
                return i9 + getContext().getString(R.string.world_clock_unit_hours);
            }
            return "+" + i9 + getContext().getString(R.string.world_clock_unit_hours);
        }
        if (intValue < 0) {
            return i9 + ":" + Math.abs(i10);
        }
        return "+" + i9 + ":" + i10;
    }

    private void renderCity(BaseViewHolder baseViewHolder, WorldClock worldClock) {
        baseViewHolder.setText(R.id.tv_city, WorldClockConvert.removeParentheses(t.getStringResourceByName(worldClock.getCityKey())));
    }

    private void renderTime(BaseViewHolder baseViewHolder, WorldClock worldClock) {
        String timeZoneIdentifier = worldClock.getTimeZoneIdentifier();
        long currentTime = b.getCurrentTime(timeZoneIdentifier);
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneIdentifier);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(i3.a.getWorldClockTimeFormat(getContext()));
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(Long.valueOf(currentTime));
        if (!BandTimeSystemProvider.is12HourTime()) {
            baseViewHolder.setText(R.id.tv_time, format);
            return;
        }
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new RelativeSizeSpan(0.4f), format.length() - 3, format.length(), 33);
        baseViewHolder.setText(R.id.tv_time, spannableString);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, WorldClock worldClock) {
        renderCity(baseViewHolder, worldClock);
        renderTime(baseViewHolder, worldClock);
        baseViewHolder.setText(R.id.tv_time_zone, getDayString(worldClock));
    }
}
