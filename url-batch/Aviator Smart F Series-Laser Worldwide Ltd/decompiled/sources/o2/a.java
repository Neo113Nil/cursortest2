package o2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.pdf.PdfDocument;
import android.print.PrintAttributes;
import android.print.pdf.PrintedPdfDocument;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.health.base.j;
import com.crrepa.band.my.health.ecg.view.b;
import com.crrepa.band.my.model.db.Ecg;
import com.crrepa.band.my.model.db.greendao.EcgDao;
import com.crrepa.band.my.model.user.provider.UserAgeProvider;
import com.crrepa.band.my.model.user.provider.UserGenderProvider;
import com.crrepa.band.my.model.user.provider.UserHeightProvider;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.moyoung.dafit.module.common.utils.m;
import com.orhanobut.logger.f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/* loaded from: classes2.dex */
public class a {
    private static final int APP_LOGO_SIZE = 42;
    private static final int APP_TEXT_SIZE = 28;
    private static final int BASE_INFO_TEXT_SIZE = 16;
    private static final String DESCRIPTION_NUMBER = "：";
    private static final int DESCRIPTION_TEXT_SIZE = 12;
    private static final float ECG_HORIZONTAL_LINE_NUMBER = 5.0f;
    private static final String ECG_MEASURE_TIME = "30";
    private static final float ECG_VERTICAL_LINE_NUMBER = 6.0f;
    private static final float GIRD_LINE_WIDTH_1 = 0.3f;
    private static final float GIRD_LINE_WIDTH_2 = 0.6f;
    private static final float GIRD_LINE_WIDTH_3 = 1.0f;
    private static final int HORIZONTAL_DPI = 630;
    private static final float HORIZONTAL_GIRD_COUNT = 25.0f;
    private static final int HORIZONTAL_LINE_MARGIN = 10;
    private static final int HORIZONTAL_MARGIN = 40;
    private static final int VERTICAL_DPI = 891;
    private static final float VERTICAL_GIRD_COUNT = 30.0f;
    private static final int VERTICAL_LINE_MARGIN = 10;
    private static final int VERTICAL_MARGIN = 30;
    private Canvas canvas;
    private Context context;
    private Ecg ecg;
    private int greyColor;
    private float gridHeight;
    private float gridWidth;
    private PdfDocument.Page page;
    private int pageHeight;
    private int pageWidth;
    private PrintedPdfDocument pdfDocument;
    private Paint paint = new Paint();
    private int blackColor = -16777216;

    public a(Context context, Ecg ecg) {
        this.context = context;
        this.ecg = ecg;
        PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(context, new PrintAttributes.Builder().setMediaSize(PrintAttributes.MediaSize.ISO_A4).setResolution(new PrintAttributes.Resolution("1", "ecg", HORIZONTAL_DPI, VERTICAL_DPI)).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).setColorMode(2).build());
        this.pdfDocument = printedPdfDocument;
        PdfDocument.Page startPage = printedPdfDocument.startPage(0);
        this.page = startPage;
        PdfDocument.PageInfo info = startPage.getInfo();
        this.pageHeight = info.getPageHeight();
        this.pageWidth = info.getPageWidth();
        this.canvas = this.page.getCanvas();
        this.greyColor = ContextCompat.getColor(context, R.color.grey);
        f.d("pageWidth: " + this.pageWidth + ",pageHeight: " + this.pageHeight);
    }

    private void drawAppInfo() {
        this.paint.setColor(this.blackColor);
        this.paint.setTextSize(28.0f);
        String string = this.context.getString(R.string.app_name);
        int textWidth = (this.pageWidth - 40) - getTextWidth(this.paint, string);
        this.canvas.drawText(string, textWidth, 122, this.paint);
        Bitmap decodeResource = BitmapFactory.decodeResource(this.context.getResources(), R$drawable.ic_app_logo);
        this.canvas.drawBitmap(decodeResource, new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight()), new Rect(textWidth - 40, 90, textWidth + 2, 132), this.paint);
    }

    private int drawBaseInfo() {
        this.paint.setColor(this.greyColor);
        this.paint.setTextSize(16.0f);
        this.canvas.drawText(this.context.getString(R.string.base_info), 40.0f, 46, this.paint);
        this.paint.setColor(this.blackColor);
        float f8 = 72;
        this.canvas.drawText(this.context.getString(R.string.gender) + DESCRIPTION_NUMBER, 40.0f, f8, this.paint);
        this.paint.setColor(this.greyColor);
        this.canvas.drawText(UserGenderProvider.getGenderList(this.context).get(UserGenderProvider.getUsetGender()), getTextWidth(this.paint, r0) + 40, f8, this.paint);
        this.paint.setColor(this.blackColor);
        float f9 = 98;
        this.canvas.drawText(this.context.getString(R.string.age) + DESCRIPTION_NUMBER, 40.0f, f9, this.paint);
        this.paint.setColor(this.greyColor);
        this.canvas.drawText(String.valueOf(UserAgeProvider.getUserAge()), getTextWidth(this.paint, r0) + 40, f9, this.paint);
        this.paint.setColor(this.blackColor);
        String str = this.context.getString(R.string.height) + DESCRIPTION_NUMBER;
        float f10 = 124;
        this.canvas.drawText(str, 40.0f, f10, this.paint);
        this.paint.setColor(this.greyColor);
        String valueOf = String.valueOf(UserHeightProvider.getUserHeight());
        int textWidth = getTextWidth(this.paint, str) + 40;
        this.canvas.drawText(valueOf, textWidth, f10, this.paint);
        int textWidth2 = textWidth + getTextWidth(this.paint, valueOf) + 10;
        this.paint.setColor(this.blackColor);
        String str2 = this.context.getString(R.string.weight) + DESCRIPTION_NUMBER;
        this.canvas.drawText(str2, textWidth2, f10, this.paint);
        this.paint.setColor(this.greyColor);
        String valueOf2 = String.valueOf(UserWeightProvider.getUserWeight());
        int textWidth3 = textWidth2 + getTextWidth(this.paint, str2);
        this.canvas.drawText(valueOf2, textWidth3, f10, this.paint);
        return textWidth3 + getTextWidth(this.paint, valueOf2);
    }

    private void drawEcgGird(int i8) {
        int i9 = (this.pageHeight - i8) - 30;
        int i10 = this.pageWidth - 80;
        f.d("height: " + i9 + ", width: " + i10);
        this.gridHeight = ((float) i9) / 180.0f;
        this.gridWidth = ((float) i10) / 125.0f;
        this.paint.setColor(this.greyColor);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            float f8 = i12;
            if (f8 > 180.0f) {
                break;
            }
            if (f8 % 30.0f == 0.0f) {
                this.paint.setStrokeWidth(1.0f);
            } else if (i12 % 5 == 0) {
                this.paint.setStrokeWidth(0.6f);
            } else {
                this.paint.setStrokeWidth(GIRD_LINE_WIDTH_1);
            }
            float f9 = (int) ((f8 * this.gridHeight) + i8);
            this.canvas.drawLine(40.0f, f9, r3 - 40, f9, this.paint);
            i12++;
        }
        while (true) {
            float f10 = i11;
            if (f10 > 125.0f) {
                return;
            }
            if (f10 % 25.0f == 0.0f) {
                this.paint.setStrokeWidth(1.0f);
            } else if (i11 % 5 == 0) {
                this.paint.setStrokeWidth(0.6f);
            } else {
                this.paint.setStrokeWidth(GIRD_LINE_WIDTH_1);
            }
            float f11 = ((int) (f10 * this.gridWidth)) + 40;
            this.canvas.drawLine(f11, i8, f11, this.pageHeight - 30, this.paint);
            i11++;
        }
    }

    private void drawEcgMeasureInfo(int i8) {
        this.paint.setColor(this.greyColor);
        this.paint.setTextSize(16.0f);
        float f8 = i8 + 20;
        this.canvas.drawText(this.context.getString(R.string.ecg_info), f8, 46, this.paint);
        this.paint.setColor(this.blackColor);
        float f9 = 72;
        this.canvas.drawText(this.context.getString(R.string.measure_date) + DESCRIPTION_NUMBER, f8, f9, this.paint);
        this.paint.setColor(this.greyColor);
        this.canvas.drawText(m.format(this.ecg.getDate(), j.getSyncTimeFormat(this.context)), getTextWidth(this.paint, r0) + r8, f9, this.paint);
        this.paint.setColor(this.blackColor);
        float f10 = 98;
        this.canvas.drawText(this.context.getString(R.string.measure_time) + DESCRIPTION_NUMBER, f8, f10, this.paint);
        this.paint.setColor(this.greyColor);
        this.canvas.drawText(ECG_MEASURE_TIME, getTextWidth(this.paint, r0) + r8, f10, this.paint);
        this.paint.setColor(this.blackColor);
        float f11 = 124;
        this.canvas.drawText(this.context.getString(R.string.average_hr) + DESCRIPTION_NUMBER, f8, f11, this.paint);
        this.paint.setColor(this.greyColor);
        this.canvas.drawText(this.ecg.getAverageHeartRate().toString(), r8 + getTextWidth(this.paint, r0), f11, this.paint);
    }

    private void drawEcgPath(int i8) {
        this.paint.setStyle(Paint.Style.STROKE);
        int[] ecgData = getEcgData();
        float f8 = this.pageWidth - 40;
        float intValue = this.gridWidth / this.ecg.getPerGridNumber().intValue();
        float f9 = this.gridHeight;
        float f10 = i8 + (15.0f * f9);
        float f11 = 30.0f * f9;
        float perGridUvValue = f9 / b.getPerGridUvValue(this.ecg.getPerGridUvValue());
        this.paint.setColor(this.blackColor);
        this.paint.setStrokeWidth(1.0f);
        Path path = new Path();
        int i9 = 0;
        int i10 = 0;
        for (int i11 : ecgData) {
            float f12 = 40.0f;
            float f13 = (i9 * intValue) + 40.0f;
            if (f8 < f13) {
                i10++;
                i9 = 0;
            } else {
                f12 = f13;
            }
            float f14 = i10;
            if (ECG_VERTICAL_LINE_NUMBER <= f14) {
                break;
            }
            float f15 = ((f14 * f11) + f10) - (i11 * perGridUvValue);
            if (i9 == 0) {
                path.moveTo(f12, f15);
            } else {
                path.lineTo(f12, f15);
            }
            i9++;
        }
        this.canvas.drawPath(path, this.paint);
    }

    private int drawEcgSpeed() {
        String str = this.context.getString(R.string.ecg_gain) + "  " + this.context.getString(R.string.ecg_speed);
        this.paint.setColor(this.greyColor);
        this.paint.setTextSize(12.0f);
        this.canvas.drawText(str, (this.pageWidth - 40) - getTextWidth(this.paint, str), 152, this.paint);
        return 152;
    }

    private void drawHintText() {
        String string = this.context.getString(R.string.ecg_hint_text);
        this.paint.setColor(this.greyColor);
        this.paint.setTextSize(12.0f);
        int textWidth = getTextWidth(this.paint, string);
        this.canvas.drawText(string, (this.pageWidth - 40) - textWidth, this.pageHeight - 8, this.paint);
    }

    private int[] getEcgData() {
        return new n2.a().readEcgData(this.ecg.getPath());
    }

    @NonNull
    private String getEcgFileName(Date date) {
        return EcgDao.TABLENAME + "_" + date.getTime() + ".pdf";
    }

    private int getTextWidth(Paint paint, String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int length = str.length();
        paint.getTextWidths(str, new float[length]);
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i8 += (int) Math.ceil(r2[i9]);
        }
        return i8;
    }

    @Nullable
    private File savePdfFile(Date date) {
        try {
            File file = new File(com.crrepa.band.my.a.getPdfPath(), getEcgFileName(date));
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (file.exists()) {
                return file;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            this.pdfDocument.writeTo(fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            this.pdfDocument.close();
            return file;
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public File buildPDF() {
        drawEcgMeasureInfo(drawBaseInfo());
        drawAppInfo();
        int drawEcgSpeed = drawEcgSpeed() + 10;
        drawEcgGird(drawEcgSpeed);
        drawEcgPath(drawEcgSpeed);
        drawHintText();
        this.pdfDocument.finishPage(this.page);
        return savePdfFile(this.ecg.getDate());
    }
}
