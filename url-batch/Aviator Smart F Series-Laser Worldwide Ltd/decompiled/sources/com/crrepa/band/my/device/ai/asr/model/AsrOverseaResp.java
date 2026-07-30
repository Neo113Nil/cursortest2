package com.crrepa.band.my.device.ai.asr.model;

import java.util.List;

/* loaded from: classes2.dex */
public class AsrOverseaResp {
    private String message;
    private RecognitionRows rows;
    private String status;

    public static class RecognitionRows {
        private String DisplayText;
        private long Duration;
        private List<NBest> NBest;
        private long Offset;
        private String RecognitionStatus;

        public static class NBest {
            private double Confidence;
            private String Display;
            private String ITN;
            private String Lexical;
            private String MaskedITN;

            public double getConfidence() {
                return this.Confidence;
            }

            public String getDisplay() {
                return this.Display;
            }

            public String getITN() {
                return this.ITN;
            }

            public String getLexical() {
                return this.Lexical;
            }

            public String getMaskedITN() {
                return this.MaskedITN;
            }

            public void setConfidence(double d8) {
                this.Confidence = d8;
            }

            public void setDisplay(String str) {
                this.Display = str;
            }

            public void setITN(String str) {
                this.ITN = str;
            }

            public void setLexical(String str) {
                this.Lexical = str;
            }

            public void setMaskedITN(String str) {
                this.MaskedITN = str;
            }
        }

        public String getDisplayText() {
            return this.DisplayText;
        }

        public long getDuration() {
            return this.Duration;
        }

        public List<NBest> getNBest() {
            return this.NBest;
        }

        public long getOffset() {
            return this.Offset;
        }

        public String getRecognitionStatus() {
            return this.RecognitionStatus;
        }

        public void setDisplayText(String str) {
            this.DisplayText = str;
        }

        public void setDuration(long j8) {
            this.Duration = j8;
        }

        public void setNBest(List<NBest> list) {
            this.NBest = list;
        }

        public void setOffset(long j8) {
            this.Offset = j8;
        }

        public void setRecognitionStatus(String str) {
            this.RecognitionStatus = str;
        }
    }

    public String getMessage() {
        return this.message;
    }

    public RecognitionRows getRows() {
        return this.rows;
    }

    public String getStatus() {
        return this.status;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setRows(RecognitionRows recognitionRows) {
        this.rows = recognitionRows;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
